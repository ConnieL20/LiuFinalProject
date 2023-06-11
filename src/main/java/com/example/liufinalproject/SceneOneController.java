package com.example.liufinalproject;


public class SceneOneController extends SceneController {

    public SceneOneController(){
        super();
        addDialogues();
        addIndexes();
        setNextFXML1("SceneTwo.fxml");
        setNextFXML2("SceneTwoTruck.fxml");
        setDialogueResult1("I'm tired. Good night.");
        setDialogueResult2("Let's go to the supermarket and get some coffee.");
    }

    public void addDialogues(){
        getDialogueCollection().getCollection().add("!!!");
        getDialogueCollection().getCollection().add("(You wake up to the sound of your own snoring. Looking around, you slowly piece together the fact...)");
        getDialogueCollection().getCollection().add("(...that you were pulling an all nighter to finish your final project after procrastinating for 2 months because of Honkai Star Rail).");
        getDialogueCollection().getCollection().add("Should I...");
    }

    public void addIndexes(){
        getNeedChoice().add(4);
    }

}
