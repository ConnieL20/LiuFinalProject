package com.example.liufinalproject;

import javafx.event.ActionEvent;

import java.io.IOException;

public class CottageController extends SceneController{
    public CottageController(){
        super();
        addDialogues();
        addIndexes();
        getCurrentCharacter().setName("Selena");
        setNextFXML1("Death.fxml");
        setNextFXML2("Cliff.fxml");
        setDialogueResult1("Excuse me??? HOW DARE YOU.");
        setDialogueResult2("Yes! Of course - I hear you girl.");
    }

    @Override
    public void addDialogues(){
        getDialogueCollection().getCollection().add("$$Why are you screaming in my home as if it is your own? Who even are you?$$");
        getDialogueCollection().getCollection().add("(Awww she's so cute. She looks like an innocent and sweet doll—)");
        getDialogueCollection().getCollection().add("$$God what is that smell?$$");
        getDialogueCollection().getCollection().add("(She sniffs and stuffs her face close to you before cringing. She looks at you in disgust).");
        getDialogueCollection().getCollection().add("$$What ditch did you crawl out of? Are you a thief? Omg you're a thie—$$");
        getDialogueCollection().getCollection().add("NONONO WAIT NO I'M NOT I'M JUST A TRAVELER WHO GOT TRAPPED IN HERE BY A MAGE.");
        getDialogueCollection().getCollection().add("$$Trapped? By a mage?$$");
        getDialogueCollection().getCollection().add("$$...$$");
        getDialogueCollection().getCollection().add("$$Does he have blue hair?$$");
        getDialogueCollection().getCollection().add("Yes. Do you know him? Are you trapped here too?");
        getDialogueCollection().getCollection().add("$$...he's my brother. I am his little sister, Selena.$$");
        getDialogueCollection().getCollection().add("...");
        getDialogueCollection().getCollection().add("Are you aware that your brother is a yandere.");
        getDialogueCollection().getCollection().add("$$A yan....der..ray? What is that? Are you trying to shame me for my lack of knowledge? How\ndare you???$$");
        getDialogueCollection().getCollection().add("NO! I—");
        getDialogueCollection().getCollection().add("$$My brother has been fooled by your beauty. My poor poor brother. He needs to be protected\nfrom the cruelty of this world.$$");
        getDialogueCollection().getCollection().add("??? Your brother is a yandere. YANDERE. HE MURDERED AN INNOCENT TEA CUP BECAUSE HE THOUGHT IT\nBURNED ME—");
        getDialogueCollection().getCollection().add("(You get silenced by a cold blade that was pressed against your neck).");
        getDialogueCollection().getCollection().add("$$Say one more insulting comment towards him and your head is gone.$$");
        getDialogueCollection().getCollection().add("$$Not that I care or anything, of course.$$");
        getDialogueCollection().getCollection().add("???");
    }

    @Override
    public void addIndexes(){
        getNeedChoice().add(21);
    }

    @Override
    public void choiceResponse(ActionEvent e) throws IOException {
        super.choiceResponse(e);

        if (getSelectedChoice() == 1){
            getDialogueCollection().getCollection().add("(All the anger and exhaustion boils in you).");
            getDialogueCollection().getCollection().add("I can say whatever I want about him. He's a psycho. You're a psycho.");
            getDialogueCollection().getCollection().add("(Selena's face darkens).");
            getDialogueCollection().getCollection().add("(The knife she is holding cuts into your skin)");
            getDialogueCollection().getCollection().add("You have died from " + getCurrentCharacter().getName() + " for insulting her beloved brother.");
        } else {
            getDialogueCollection().getCollection().add("(Selena nods and puts her knife away).");
            getDialogueCollection().getCollection().add("$$Good. Now, I will be checking on my brother now. His feelings must be so hurt because of you.$$");
            getDialogueCollection().getCollection().add("(She turns around and leaves).");
            getDialogueCollection().getCollection().add("...I am getting the hell out of here.");
            getDialogueCollection().getCollection().add("(You find a vent to vent).");
        }

    }
}
