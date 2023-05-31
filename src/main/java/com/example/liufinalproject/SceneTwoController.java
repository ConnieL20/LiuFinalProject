package com.example.liufinalproject;

public class SceneTwoController extends SceneController{
    public SceneTwoController(){
        super();
        addDialogues();
        addIndexes();
        setNextFXML("SceneThree.fxml");
        setDialogueResult1("(You open your eyes)");
        setDialogueResult2("(You're confused but you still open your eyes anyways)");
    }

    @Override
    public void addDialogues(){
        getDialogueCollection().getCollection().add("Where am I? Why can't I see anything?");
        getDialogueCollection().getCollection().add("...Did I die?");
        getDialogueCollection().getCollection().add("*No you didn't~*");
        getDialogueCollection().getCollection().add("?!?! Who's there?? And how would you know - I can't see anything!");
        getDialogueCollection().getCollection().add("*I am your lord and savior. My name is Hubert Blaine Wolfeschlegelsteinhausenbergerdorff.~*");
        getDialogueCollection().getCollection().add("*But you can just call me Bob~*");
        getDialogueCollection().getCollection().add("*As for your second question, you can't see anything because-*");
        getDialogueCollection().getCollection().add("I'm dead?");
        getDialogueCollection().getCollection().add("*...your eyes are still closed, honey.~*");
        getDialogueCollection().getCollection().add("Oh.");

    }

    @Override
    public void addIndexes(){
        getNeedChoice().add(10);
    }

    @Override
    public void decideWhichScenes() {

    }

}
