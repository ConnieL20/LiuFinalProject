package com.example.liufinalproject;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class SceneController {
    //instance variables
    @FXML
    private Button nextButton;

    private String dialogueResult1;
    private String dialogueResult2;
    private int selectedChoice;
    @FXML
    private Label dialogue;
    @FXML
    private DialogueCollection dialogueCollection;
    private Stage stage;
    private Scene scene;
    @FXML
    private Button choice;
    @FXML
    private Button choice2;
    int penaltyPoints;
    private Character currentCharacter;

    private boolean thereIsACharacter;
    private boolean hasDifferentScenes;
    int counter;
    int needIdx;
    private ArrayList<Integer> needChoice;
    private String nextFXML;

    public SceneController(){
        //setting up the arrayList of dialogue in this scene
        ArrayList<String> testDialogue = new ArrayList<>();
        dialogueCollection = new DialogueCollection(testDialogue);
        dialogueResult1 = "This works";
        dialogueResult2 = "This works2";
        selectedChoice = 0;
        needChoice = new ArrayList<>();
        counter = 0;
        penaltyPoints = 0;
        thereIsACharacter = false;
        hasDifferentScenes = false;
        currentCharacter = new Character();
        nextFXML = "HomePage.fxml";
        choice = new Button();
        choice2 = new Button();
    }

    //getter and setter methods
    public DialogueCollection getDialogueCollection(){
        return dialogueCollection;
    }

    public void setDialogueCollection(DialogueCollection newCollection){
        dialogueCollection = newCollection;
    }

    public ArrayList<Integer> getNeedChoice(){
        return needChoice;
    }

    public void setNeedChoice(ArrayList<Integer> newNeedChoice){
        needChoice = newNeedChoice;
    }

    public String getNextFXML(){
        return nextFXML;
    }

    public void setNextFXML(String next){
        nextFXML = next;
    }

    public Button getChoice(){
        return choice;
    }
    public Button getChoice2(){
        return choice2;
    }


    public void setDialogueResult1(String str){
        dialogueResult1 = str;
    }


    public void setDialogueResult2(String str){
        dialogueResult2 = str;
    }

    public String getDialogueResult1(){
        return dialogueResult1;
    }

    public String getDialogueResult2(){
        return dialogueResult2;
    }

    public int getSelectedChoice(){
        return selectedChoice;
    }

    public void setSelectedChoice(int selected){
        selectedChoice = selected;
    }

    public void setHasDifferentScenes(boolean differentScenes){
        hasDifferentScenes = differentScenes;
    }

    public void nextDialogue(ActionEvent e) throws IOException{
        counter++;
        if (counter <= dialogueCollection.getLen()){
            dialogue.setText(dialogueCollection.getCollection().get(counter - 1));
            if (counter == needChoice.get(needIdx)){
                nextButton.setDisable(true);
                delay(500, () -> choice.setVisible(true));
                delay(500, () -> choice2.setVisible(true));
            }
        } else {
            calculateMeter();
            if (hasDifferentScenes){
                decideWhichScene();
            }
            switchToHome(e);
        }
    }

    public void choiceResponse(ActionEvent e) throws IOException{
        Button buttonChosen = ((Button) e.getSource());
        if (buttonChosen.getText().equals(choice.getText())){
            selectedChoice = 1;
            dialogueCollection.getCollection().add(dialogueResult1);
        } else {
            selectedChoice = 2;
            dialogueCollection.getCollection().add(dialogueResult2);
            if (thereIsACharacter){
                penaltyPoints += 25;
            }
        }
        choice.setVisible(false);
        choice2.setVisible(false);
        nextButton.setDisable(false);
    }

    public void calculateMeter(){
        if (penaltyPoints > 0){
            currentCharacter.subtractMeter(penaltyPoints);
        }
    }

    public void addDialogues(){
    }

    public void addIndexes(){
    }
    public void decideWhichScene(){
        if (selectedChoice == 1){
            setNextFXML("SceneTwo.fxml");
        } else {
            setNextFXML("SceneTwoTruck.fxml");
        }
    }


    private void switchToHome(ActionEvent e) throws IOException{
        //loads window
        FXMLLoader fxmlLoader = new FXMLLoader(HomeController.class.getResource(nextFXML));
        //load the scene/window
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public static void delay(long millis, Runnable continuation) {
        Task<Void> sleeper = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                try { Thread.sleep(millis); }
                catch (InterruptedException e) { }
                return null;
            }
        };
        sleeper.setOnSucceeded(event -> continuation.run());
        new Thread(sleeper).start();
    }

    public abstract void decideWhichScenes();
}
