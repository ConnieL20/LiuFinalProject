package com.example.liufinalproject;

import javafx.event.ActionEvent;

import java.io.IOException;

public class ParadeController extends SceneController {

    public ParadeController(){
        super();
        addDialogues();
        addIndexes();
        getCurrentCharacter().setName("Vercingetorix");
        setNextFXML1("Death.fxml");
        setNextFXML2("Duke.fxml");
        setDialogueResult1("He's handsome. I don't care what I have to do!");
        setDialogueResult2("(You summon all your strength and smack Vercingetroix in the face. He starts sobbing and scoffing while holding his red cheek).");
    }

    @Override
    public void addDialogues(){
        getDialogueCollection().getCollection().add("WOAH!");
        getDialogueCollection().getCollection().add("(You're taken aback. You didn't realize you would encounter such a beautiful person so soon).");
        getDialogueCollection().getCollection().add("**Unbelievable! To think you would actually meet the prince of this world. How lucky~**");
        getDialogueCollection().getCollection().add("Hello! Nice to meet you. What's your name?");
        getDialogueCollection().getCollection().add("(The prince sneers at you in disgust).");
        getDialogueCollection().getCollection().add("##You dare talk to ME peasant?##");
        getDialogueCollection().getCollection().add("Well that was unexpected...I-I mean, apologies! This peasant should not have spoken.");
        getDialogueCollection().getCollection().add("(You begin turning around to walk away in shame until the prince stops you).");
        getDialogueCollection().getCollection().add("##Since you possess such beautiful beauty, I shall grace you with my presence and my answer! My name is\nVercingetorix Julius Augustus Ceasar Aristotle—##");
        getDialogueCollection().getCollection().add("Is he just listing Roman names?");
        getDialogueCollection().getCollection().add("**It appears so...quite unexpected to find such a...special child here~**");
        getDialogueCollection().getCollection().add("You aren't familiar with this world?");
        getDialogueCollection().getCollection().add("**NOPE~**");
        getDialogueCollection().getCollection().add("##—Now that you know my name you must become my maid servant!##");
        getDialogueCollection().getCollection().add("E-EXCUSE ME??? I WANT TO BE YOUR LOVER NOT YOUR SERVANT—");
        getDialogueCollection().getCollection().add("##Oh. Sure!##");
        getDialogueCollection().getCollection().add("**...~**");
        getDialogueCollection().getCollection().add("...");
        getDialogueCollection().getCollection().add("Well that was easy—");
        getDialogueCollection().getCollection().add("##You must first lick my shoe and pledge your entire body to me!##");
        getDialogueCollection().getCollection().add("Uh...");

    }

    @Override
    public void addIndexes(){
        getNeedChoice().add(21);
    }

    @Override
    public void choiceResponse(ActionEvent e) throws IOException {
        super.choiceResponse(e);

        if (getSelectedChoice() == 2){
            getDialogueCollection().getCollection().add("##Y-YOU-##");
            getDialogueCollection().getCollection().add("(Vercingetorix cuts himself off and starts waving his hands around. The parade stops and the crowd goes silence).");
            getDialogueCollection().getCollection().add("Uhhh Bob?");
            getDialogueCollection().getCollection().add("**Yes~**");
            getDialogueCollection().getCollection().add("I won't be in trouble from smacking this nation's prince right?");
            getDialogueCollection().getCollection().add("**Yes~**");
            getDialogueCollection().getCollection().add("Will I die?");
            getDialogueCollection().getCollection().add("**Yes~**");
            getDialogueCollection().getCollection().add("...");
            getDialogueCollection().getCollection().add("##GUARDS TAKE THEM AWAY!!!##");
            getDialogueCollection().getCollection().add("Oh sh—");
            getDialogueCollection().getCollection().add("*BONK*");
            getDialogueCollection().getCollection().add("(Something solid hits the back of your head and before you know it, you face plant onto the floor).");
        } else {
            getDialogueCollection().getCollection().add("**...~**");
            getDialogueCollection().getCollection().add("(You finish but before you can get up, you collapse).");
            getDialogueCollection().getCollection().add("You died from digesting poison from " + getCurrentCharacter().getName() + "'s shoe.");

        }

    }
}
