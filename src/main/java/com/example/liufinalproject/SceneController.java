package com.example.liufinalproject;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public abstract class SceneController {
    //instance variables
    @FXML
    private Button nextButton;
    @FXML
    private Rectangle box;
    private String dialogueResult1;
    private String dialogueResult2;
    private int selectedChoice;
    @FXML
    private Label dialogue;
    @FXML
    private final DialogueCollection dialogueCollection;
    private Stage stage;
    private Scene scene;
    @FXML
    private Button choice;
    @FXML
    private Button choice2;
    private Character currentCharacter;
    private DeathController deathController;

    int counter;
    int needIdx;
    private ArrayList<Integer> needChoice;
    private String nextFXML;
    private String nextFXML1;
    private String nextFXML2;

    public SceneController(){
        //setting up the arrayList of dialogue in this scene
        ArrayList<String> testDialogue = new ArrayList<>();
        dialogueCollection = new DialogueCollection(testDialogue);
        dialogueResult1 = "This works";
        dialogueResult2 = "This works2";
        dialogue = new Label();
        box = new Rectangle();
        selectedChoice = 0;
        needChoice = new ArrayList<>();
        counter = 0;
        currentCharacter = new Character();
        deathController = new DeathController();
        nextFXML1 = "HomePage.fxml";
        nextFXML2 = "Scene.fxml";
        choice = new Button();
        choice2 = new Button();
    }

    //getter and setter methods
    public DialogueCollection getDialogueCollection(){
        return dialogueCollection;
    }

    public ArrayList<Integer> getNeedChoice(){
        return needChoice;
    }

    public Label getDialogue(){
        return dialogue;
    }

    public Button getNextButton(){
        return nextButton;
    }

    public Button getChoice(){
        return choice;
    }

    public Button getChoice2(){
        return choice2;
    }

    public void setNextFXML1(String next){
        nextFXML1 = next;
    }

    public void setNextFXML2(String next){
        nextFXML2 = next;
    }

    public void setDialogueResult1(String str){
        dialogueResult1 = str;
    }


    public void setDialogueResult2(String str){
        dialogueResult2 = str;
    }

    public Character getCurrentCharacter(){
        return currentCharacter;
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

    public DeathController getDeathController(){
        return deathController;
    }


    /**
     * @param e
     * @throws IOException
     *
     * When the user clicks anywhere on the screen, the method will iterate through the dialogue collection and display
     * the next piece of dialogue. It will check the index with the dialogue that is prompting the user to choose an
     * option.
     */
    public void nextDialogue(ActionEvent e) throws IOException{

        counter++;
        if (counter <= dialogueCollection.getLen()){
            dialogue.setText(dialogueCollection.getCollection().get(counter - 1));
            decideColors();
            if (counter == needChoice.get(needIdx)){
                nextButton.setDisable(true);
                delay(500, () -> choice.setVisible(true));
                delay(500, () -> choice2.setVisible(true));
            }
        } else {
            decideWhichScenes();
            switchToHome(e);
        }
    }


    /**
     * @param e
     * @throws IOException
     *
     * This method checks which button the user clicked on and helps decide which route the user will be on or the
     * correct corresponding dialogue in response to that choice.
     */

    public void choiceResponse(ActionEvent e) throws IOException{
        Button buttonChosen = ((Button) e.getSource());
        if (buttonChosen.getText().equals(choice.getText())){
            selectedChoice = 1;
            dialogueCollection.getCollection().add(dialogueResult1);
        } else {
            selectedChoice = 2;
            dialogueCollection.getCollection().add(dialogueResult2);
        }
        choice.setVisible(false);
        choice2.setVisible(false);
        nextButton.setDisable(false);
        dialogue.setText(dialogueCollection.getCollection().get(dialogueCollection.getLen() - 1));

        if (selectedChoice == 1){
            dialogueCollection.getCollection().remove(dialogueResult1);
        } else {
            dialogueCollection.getCollection().remove(dialogueResult2);
        }
    }

    public void decideColors(){
        if (dialogue.getText().contains("**")){ //Bob
            dialogue.setText(dialogue.getText().substring(2, dialogue.getText().length() - 2));
            dialogue.setTextFill(Color.web("#8f8f8f"));
            box.setStroke(Color.web("#8f8f8f"));
        } else if (dialogue.getText().contains("##")){ //Vercingetorix
            dialogue.setText(dialogue.getText().substring(2, dialogue.getText().length() - 2));
            dialogue.setTextFill(Color.web("#66ffff"));
            box.setStroke(Color.web("#66ffff"));
        } else if (dialogue.getText().contains("@@")){ //Duke
            dialogue.setText(dialogue.getText().substring(2, dialogue.getText().length() - 2));
            dialogue.setTextFill(Color.web("#8d72b5"));
            box.setStroke(Color.web("#8d72b5"));
        } else if (dialogue.getText().contains("^^")){ //yandere
            dialogue.setText(dialogue.getText().substring(2, dialogue.getText().length() - 2));
            dialogue.setTextFill(Color.web("#4aa7ff"));
            box.setStroke(Color.web("#4aa7ff"));
        } else if (dialogue.getText().contains("&&")){ //forest spirit
            dialogue.setText(dialogue.getText().substring(2, dialogue.getText().length() - 2));
            dialogue.setTextFill(Color.web("#76f26b"));
            box.setStroke(Color.web("#76f26b"));
        } else if (dialogue.getText().contains("$$")){ //selena
            dialogue.setText(dialogue.getText().substring(2, dialogue.getText().length() - 2));
            dialogue.setTextFill(Color.web("#fa69d8"));
            box.setStroke(Color.web("#fa69d8"));
        } else {
            dialogue.setTextFill(Color.web("#ffcb47"));
            box.setStroke(Color.web("#ffcb47"));
        }
    }


    public void addDialogues(){
    }

    public void addIndexes(){
    }
    public void decideWhichScenes(){
        if (selectedChoice == 1){
            nextFXML = nextFXML1;
        } else {
            nextFXML = nextFXML2;
        }
    }


    public void switchToHome(ActionEvent e) throws IOException{
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

}
