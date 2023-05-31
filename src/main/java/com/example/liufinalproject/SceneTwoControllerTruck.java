package com.example.liufinalproject;

public class SceneTwoControllerTruck extends SceneController{
    public SceneTwoControllerTruck(){
        super();
        addDialogues();
        addIndexes();
        setNextFXML("SceneThree.fxml");
        setDialogueResult1("Time to use the skills I gained from that Track unit I had in track!");
        setDialogueResult2("...just come at me already.");
    }

    @Override
    public void addDialogues(){
        getDialogueCollection().getCollection().add("(You walk outside of your home and before you cross the street...)");
        getDialogueCollection().getCollection().add("!?!?!");
        getDialogueCollection().getCollection().add("AW S@*%-");
    }

    @Override
    public void addIndexes(){
        getNeedChoice().add(3);
    }

    @Override
    public void decideWhichScenes() {

    }


}
