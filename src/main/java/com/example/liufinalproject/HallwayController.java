package com.example.liufinalproject;

import javafx.event.ActionEvent;

import java.io.IOException;

public class HallwayController extends SceneController{
    public HallwayController(){
        super();
        addDialogues();
        addIndexes();
        setNextFXML1("Cottage.fxml");
        setNextFXML2("Cottage.fxml");
        setDialogueResult1("(Someone clears their throat behind you).");
        setDialogueResult2("(Someone taps your shoulder).");
    }

    @Override
    public void addDialogues(){
        getDialogueCollection().getCollection().add("He's a yandere. He's definitely yandere. How the hell did I meet a yandere here.");
        getDialogueCollection().getCollection().add("(You cry on the inside).");
        getDialogueCollection().getCollection().add("WHERE IS BOB???");
    }

    @Override
    public void addIndexes(){
        getNeedChoice().add(3);
    }
}
