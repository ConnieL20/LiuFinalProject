package com.example.liufinalproject;

import javafx.event.ActionEvent;

import java.io.IOException;

public class DukeController extends SceneController {

    public DukeController(){
        super();
        addDialogues();
        addIndexes();
        getCurrentCharacter().setName("Psycho Duke");
        setNextFXML1("Forest.fxml");
        setNextFXML2("Death.fxml");
        setDialogueResult1("(You stick up the finger at him before bolting towards the open window).");
        setDialogueResult2("(No, you will succeed in winning his heart even if it means staying).");
    }

    @Override
    public void addDialogues(){
        getDialogueCollection().getCollection().add("**Honey~ You're finally awake~**");
        getDialogueCollection().getCollection().add("(You curse from the aching bump on the back of your head. When you finally get used to the pain, you notice a stranger in\nfront of you).");
        getDialogueCollection().getCollection().add("GAHH ANOTHER HANDSOME ONE. BOB IS HE CRAZY TOO???");
        getDialogueCollection().getCollection().add("**I do not think so...he is the sensible duke of this realm I believe~**");
        getDialogueCollection().getCollection().add("(Ok ok...first guy was a failure. This is my second chance!)");
        getDialogueCollection().getCollection().add("Hi! Nice to meet you. May I know who you are?");
        getDialogueCollection().getCollection().add("(The man stares at you for a while before giving a small grin).");
        getDialogueCollection().getCollection().add("@@You're going to try and whoo me into developing a relationship with you, aren't you?@@");
        getDialogueCollection().getCollection().add("HOW DID Y-I mean no of course not.");
        getDialogueCollection().getCollection().add("@@I am not interested in someone who pours cereal before milk. Don't ask how I know, I just do.@@");
        getDialogueCollection().getCollection().add("**Ouch~**");
        getDialogueCollection().getCollection().add("Well that was a painful rejection...wait.");
        getDialogueCollection().getCollection().add("What's wrong with pouring cereal in before milk? That's the proper and only way.");
        getDialogueCollection().getCollection().add("@@Incorrect. You should pour milk before cereal.@@");
        getDialogueCollection().getCollection().add("(Bob.)");
        getDialogueCollection().getCollection().add("**Yes~**");
        getDialogueCollection().getCollection().add("(He's a psychopath).");
        getDialogueCollection().getCollection().add("@@Why do you look so serious? How strange.@@");
        getDialogueCollection().getCollection().add("Serious? OF COURSE IT'S SERIOUS. IT'S A MATTER OF LIFE AND DEATH.");
        getDialogueCollection().getCollection().add("@@Death is a social construct.@@");
        getDialogueCollection().getCollection().add("...");
        getDialogueCollection().getCollection().add("**...~**");
        getDialogueCollection().getCollection().add("@@I can understand the concept of death however I do not see the need of fearing it, or mourning those who succumb to it.\nThere are worse things than death.@@");
        getDialogueCollection().getCollection().add("@@Such as pulling out your fingernails, locking you into an iron coffin with an iron mask, or tying down your arms and\nlegs to four horses and have them pull you apa—@@");
        getDialogueCollection().getCollection().add("**I suggest you escape from this man quickly, honey. Look, there's an opened window!~**");
        getDialogueCollection().getCollection().add("(What should I do?)");
    }

    @Override
    public void addIndexes(){
        getNeedChoice().add(26);
    }

    @Override
    public void choiceResponse(ActionEvent e) throws IOException {
        super.choiceResponse(e);

        if (getSelectedChoice() == 2){
            getDialogueCollection().getCollection().add("**Honey—**");
            getDialogueCollection().getCollection().add("Do continue on, sir.");
            getDialogueCollection().getCollection().add("(The Duke looks surprised but he smiles again. It sends chills down your spine).");
            getDialogueCollection().getCollection().add("You die from " + getCurrentCharacter().getName() + ".");
        } else {
            getDialogueCollection().getCollection().add("@@Halt!@@");
            getDialogueCollection().getCollection().add("NO YOU'RE A PSYCHOPATH.");
            getDialogueCollection().getCollection().add("(He stops and everything goes silent).");
            getDialogueCollection().getCollection().add("@@...you should never tell a psychopath they're a psychopath. It makes them...upset.@@");
            getDialogueCollection().getCollection().add("(Before he can reach you, you jump out the window).");



        }

    }
}


