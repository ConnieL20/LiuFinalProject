package com.example.liufinalproject;

import javafx.event.ActionEvent;

import java.io.IOException;

public class SceneThreeController extends SceneController {
    public SceneThreeController(){
        super();
        addDialogues();
        addIndexes();
        setNextFXML1("Parade.fxml");
        setNextFXML2("Forest.fxml");
        setDialogueResult1("I smell food. I want food. Parade has food. ¬‿¬");
        setDialogueResult2("Time to go touch some grass!");
    }

    @Override
    public void addDialogues(){
        getDialogueCollection().getCollection().add("AHHH MY EYES!!! WHY IS THE SUN SO BRIGHT???");
        getDialogueCollection().getCollection().add("**Honey...it's night time~**");
        getDialogueCollection().getCollection().add("I HAVEN'T SEEN THE LIGHT OF DAY FOR THREE MONTHS—");
        getDialogueCollection().getCollection().add("(You pause and register the unknown voice. You look around and, indeed, it was night time).");
        getDialogueCollection().getCollection().add("**Are you crying?~**");
        getDialogueCollection().getCollection().add("(You sniffle because you realize it's been so long since you stepped outside your home. The air smelled clean, unlike the\ndisgusting smell of your room that was infested with rotten eggs).");
        getDialogueCollection().getCollection().add("(But most of all...it was the sound of pEopLe...)");
        getDialogueCollection().getCollection().add("Hey Woldgangmarchblah—");
        getDialogueCollection().getCollection().add("**Call me Bob honey~**");
        getDialogueCollection().getCollection().add("From the looks of it, I'm in a different world right now, right? In a different body?");
        getDialogueCollection().getCollection().add("**Yes. You can do anything your heart desires now~**");
        getDialogueCollection().getCollection().add("So...I can live out my regrets? Do anything I wasn't able to in my past life?");
        getDialogueCollection().getCollection().add("**Of course! I will help you with anything—~**");
        getDialogueCollection().getCollection().add("I don't want to be single anymore.");
        getDialogueCollection().getCollection().add("**...~**");
        getDialogueCollection().getCollection().add("(You nod to yourself happily. Yes, you will live a new life without feeling lonely!)");
        getDialogueCollection().getCollection().add("Where should I head first?");
    }

    @Override
    public void addIndexes(){
        getNeedChoice().add(17);
    }

    @Override
    public void choiceResponse(ActionEvent e) throws IOException {
        super.choiceResponse(e);

        if (getSelectedChoice() == 2){
            getDialogueCollection().getCollection().add("(You bolt towards the forest in glee and hurry).");
            getDialogueCollection().getCollection().add("(But becase of how quickly you ran, nearby guards think you're a thief and begin chasing you).");
        } else {
            getDialogueCollection().getCollection().add("(You walk towards the bustling crowds. The air smelled of all kinds of delicious foods and music fills your ears).");
            getDialogueCollection().getCollection().add("(Then something catches your eye).");
        }

    }
}

