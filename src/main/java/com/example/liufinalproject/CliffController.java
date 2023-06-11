package com.example.liufinalproject;

import javafx.event.ActionEvent;

import java.io.IOException;

public class CliffController extends SceneController{
    public CliffController(){
        super();
        addDialogues();
        addIndexes();
        setNextFXML1("Bob.fxml");
        setNextFXML2("Death.fxml");
        setDialogueResult1("...none of them. They were at crazy.");
        setDialogueResult2("I should've never been brought back to life here. I hate everything about this world. I miss the life\nI had before this.");
    }

    @Override
    public void addDialogues(){
        getDialogueCollection().getCollection().add("(After what felt like a century, you find your way out of the forest).");
        getDialogueCollection().getCollection().add("BOBBBB");
        getDialogueCollection().getCollection().add("BOBBYYYYYY—");
        getDialogueCollection().getCollection().add("**I am here!~**");
        getDialogueCollection().getCollection().add("OMG BOB I NEVER THOUGHT I WOULD MISS HEARING YOUR VOICE IN MY HEAD.");
        getDialogueCollection().getCollection().add("**The forest's mage and spirit blocked me. You...you missed me?~**");
        getDialogueCollection().getCollection().add("(You collapse onto your knees on top of the grass and stare at the sunset.)");
        getDialogueCollection().getCollection().add("(But then you roll around onto your stomach and stuff your face in the grass).");
        getDialogueCollection().getCollection().add("**..what are you doing, honey~**");
        getDialogueCollection().getCollection().add("The sun was too bright. One of my missions was to touch grass. So I'm touching grass.");
        getDialogueCollection().getCollection().add("**Ah. And what of your other mission? Did you find your soulmate?~**");
        getDialogueCollection().getCollection().add("(You start hysterically sobbing out of confusion).");
        getDialogueCollection().getCollection().add("WHAT'S THE POINT OF BEING BEAUTIFUL IF YOU'RE A NARCISSIST, A PSYCHO, A CREEPY SPIRIT,\nA YANDERE MAGE, AND A TSUNDERE YANDERE GIRL.");
        getDialogueCollection().getCollection().add("**...~**");
        getDialogueCollection().getCollection().add("**So did you like any of them?~**");
        getDialogueCollection().getCollection().add("I liked...");

    }

    @Override
    public void addIndexes(){
        getNeedChoice().add(16);
    }

    @Override
    public void choiceResponse(ActionEvent e) throws IOException {
        super.choiceResponse(e);

        if (getSelectedChoice() == 1){
            getDialogueCollection().getCollection().add("You're the only one I don't entirely hate, Bob.");
            getDialogueCollection().getCollection().add("(You say it offhandedly, your vision still directed towards the grass and your face\naway from the sun).");
            getDialogueCollection().getCollection().add("(You sigh from the long day and close your eyes. You almost fall asleep until...)");
            getDialogueCollection().getCollection().add("(You hear a rustle next to you).");
        } else {
            getDialogueCollection().getCollection().add("You should've never woken me up.");
            getDialogueCollection().getCollection().add("(Bob remains silent but you sense something is amiss).");
            getDialogueCollection().getCollection().add("Bob?");
            getDialogueCollection().getCollection().add("(Bob is silent).");
            getDialogueCollection().getCollection().add("???");
            getDialogueCollection().getCollection().add("(For an hour, you call and call out for him. But no reply).");
            getDialogueCollection().getCollection().add("Eventually, you feel your body weakening and your mind go fuzzy.");
            getDialogueCollection().getCollection().add("You have died of an unknown reason that you will never uncover.");
        }

    }
}
