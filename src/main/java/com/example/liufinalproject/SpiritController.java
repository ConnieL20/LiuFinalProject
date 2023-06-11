package com.example.liufinalproject;

import javafx.event.ActionEvent;

import java.io.IOException;

public class SpiritController extends SceneController {
    public SpiritController(){
        super();
        addDialogues();
        addIndexes();
        getCurrentCharacter().setName("Lynx the Forest Spirit");
        setNextFXML1("Mage.fxml");
        setNextFXML2("Death.fxml");
        setDialogueResult1("I'm good...BUT LOOK I SEE SOMEONE ELSE OVER THERE!");
        setDialogueResult2("Bet. I wouldn't mind playing with you forever.");
    }

    @Override
    public void addDialogues(){
        getDialogueCollection().getCollection().add("???");
        getDialogueCollection().getCollection().add("&&Oh? How unusual...&&");
        getDialogueCollection().getCollection().add("&&This is the first time I have ever seen a different soul living inside of another human body.&&");
        getDialogueCollection().getCollection().add("(Wow her hair is so green. But it's lowkey really pretty. Right Bob?)");
        getDialogueCollection().getCollection().add("(Bob is silent).");
        getDialogueCollection().getCollection().add("&&Are you lost? Don't worry. I'm lost too! Let's find a way out together.&&");
        getDialogueCollection().getCollection().add("Oh...sorry but who are you?");
        getDialogueCollection().getCollection().add("(The girl giggles like a child).");
        getDialogueCollection().getCollection().add("&&I am a forest spirit. Though, this isn't my forest, of course. I have been trapped in this dreary\nplace for a century now...&&");
        getDialogueCollection().getCollection().add("A CENTURY??? GIRL HOW OLD ARE YOU WHAT THE F—");
        getDialogueCollection().getCollection().add("&&Language! I am but a child. Come now, let us play together forever! We will have so much fun...\nI would love to play with you.&&");
        getDialogueCollection().getCollection().add("(You open your mouth to yell at her but as you stare into her eyes, you find yourself conflicted and enchanted).");
        getDialogueCollection().getCollection().add("(A faint voice in the back of your head is screaming for you to snap out of it).");
        getDialogueCollection().getCollection().add("Should I listen to the voice or follow my instincts?");

    }

    @Override
    public void addIndexes(){
        getNeedChoice().add(14);
    }

    @Override
    public void choiceResponse(ActionEvent e) throws IOException {
        super.choiceResponse(e);

        if (getSelectedChoice() == 1){
            getDialogueCollection().getCollection().add("(You point behind the spirit and she turns her around curiously).");
            getDialogueCollection().getCollection().add("&&Where? Where? I don't—&&");
            getDialogueCollection().getCollection().add("&&OW!&&");
            getDialogueCollection().getCollection().add("TAKE THAT!");
            getDialogueCollection().getCollection().add("(You hit her on the head with rock like how so many before had done to you).");
            getDialogueCollection().getCollection().add("(You summon your remaining strength and get the hell out of there).");
            getDialogueCollection().getCollection().add("(You run down the rocky path until you stumble across an open space with a small yet cute\ncottage sitting in the center).");
            getDialogueCollection().getCollection().add("(You approach it and knock on the door, only to find it unlocked and already opened).");
            getDialogueCollection().getCollection().add("(You walk in, surveying your new surroundings).");
            getDialogueCollection().getCollection().add("(A part of you is calling for Bob to answer your questions. But for some reason he has been\nsilent all this time...)");
            getDialogueCollection().getCollection().add("!!!");
        } else {
            getDialogueCollection().getCollection().add("(The spirit smiles happily and grabs your hand before pulling you deeper into the forest.)");
            getDialogueCollection().getCollection().add("(The voice in your head goes quiet and you lose control of your entire body).");
            getDialogueCollection().getCollection().add("You have been killed by " + getCurrentCharacter().getName() + "'s human experimentation.");
        }

    }
}
