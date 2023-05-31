package com.example.liufinalproject;

public class SceneThreeController extends SceneController {
    public SceneThreeController(){
        super();
        addDialogues();
        addIndexes();
        setHasDifferentScenes(true);
        setDialogueResult1("I smell food. I want food. Parade has food. We go food!");
        setDialogueResult2("I need to become a better version of myself. Time to go touch some grass!");
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
    public void decideWhichScenes(){
        if (getSelectedChoice() == 1){
            setNextFXML("Scene.fxml");
        } else {
            setNextFXML("HomePage.fxml");
        }
    }

}

