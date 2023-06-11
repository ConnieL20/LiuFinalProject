package com.example.liufinalproject;

import javafx.event.ActionEvent;

import java.io.IOException;

public class BobController extends SceneController{
    public BobController(){
        super();
        addDialogues();
        addIndexes();
        setNextFXML1("TheEnd.fxml");
        setNextFXML2("TheEnd.fxml");
        setDialogueResult1("No. I think I should be thankful for that.");
        setDialogueResult2("(You don't know why but you thank him).");
    }

    @Override
    public void addDialogues(){
        getDialogueCollection().getCollection().add("**Don't turn around~**");
        getDialogueCollection().getCollection().add("?");
        getDialogueCollection().getCollection().add("(You respect his decision).");
        getDialogueCollection().getCollection().add("**You don't hate me for bringing you back to life here?~**");
        getDialogueCollection().getCollection().add("Why did you do it though?");
        getDialogueCollection().getCollection().add("**...~**");
        getDialogueCollection().getCollection().add("**That's a secret, honey~**");
        getDialogueCollection().getCollection().add("**Apologies for choosing such a strange world. I truly though you would've been happy here~**");
        getDialogueCollection().getCollection().add("Don't worry about it. I guess if you remain single in one life, you'll be single in another.\nNo worries, I think I've gotten used to it at this point!");
        getDialogueCollection().getCollection().add("**...say, if you ever meet an individual that is...unpleasing to the eyes, hideous, and monstr—~**");
        getDialogueCollection().getCollection().add("(You yawn but you want to answer before you fall asleep).");
        getDialogueCollection().getCollection().add("I learned from today that beauty isn't everything. As long as that person is kind and has a good heart...");
        getDialogueCollection().getCollection().add("Then they deserve a chance.");
        getDialogueCollection().getCollection().add("(You yawn again. The grass is surprisingly very comfortable and sleep-inducing like ASMR).");
        getDialogueCollection().getCollection().add("Good night Bob. Wake me up tomorrow and let's explore...");
        getDialogueCollection().getCollection().add("(You fall asleep).");
        getDialogueCollection().getCollection().add("**...~**");
        getDialogueCollection().getCollection().add("***laughs*~**");
        getDialogueCollection().getCollection().add("**I'm happy~**");
        getDialogueCollection().getCollection().add("You have reached the end. Congratulations! You learned to see beauty on the inside.");

    }

    @Override
    public void addIndexes(){
        getNeedChoice().add(4);
    }

}
