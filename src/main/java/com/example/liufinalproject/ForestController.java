package com.example.liufinalproject;

import javafx.event.ActionEvent;

import java.io.IOException;

public class ForestController extends SceneController{

    public ForestController(){
      super();
      addDialogues();
      addIndexes();
      setNextFXML1("Spirit.fxml");
      setNextFXML2("Mage.fxml");
      setDialogueResult1("Left we go!");
      setDialogueResult2("Right we go!");
}

    @Override
    public void addDialogues(){
        getDialogueCollection().getCollection().add("STOP I NEED TO STOP RUNNING I CAN'T.");
        getDialogueCollection().getCollection().add("(You pant furiously. It had been months since you last worked out. The last time you ran\nwas during—)");
        getDialogueCollection().getCollection().add("**Good job running away! But look, we're in a fork in a road~**");
        getDialogueCollection().getCollection().add("Ok...which one should I choose?");
    }

    @Override
    public void addIndexes(){
        getNeedChoice().add(4);
    }

    @Override
    public void choiceResponse(ActionEvent e) throws IOException {
        super.choiceResponse(e);

        if (getSelectedChoice() == 2){
            getDialogueCollection().getCollection().add("(You walk down the rocky path until you stumble across an open space with a small yet cute\ncottage sitting in the center).");
            getDialogueCollection().getCollection().add("(You approach it and knock on the door, only to find it unlocked and already opened).");
            getDialogueCollection().getCollection().add("(You walk in, surveying your new surroundings).");
            getDialogueCollection().getCollection().add("(A part of you is calling for Bob to answer your questions. But for some reason he has been\nsilent all this time...)");
            getDialogueCollection().getCollection().add("!!!");
        } else {
            getDialogueCollection().getCollection().add("(You walk down the grassy path until the forest gets darker and darker...)");
            getDialogueCollection().getCollection().add("(You hear laughter and call out for Bob only to find you can't hear him nor your own thoughts).");
            getDialogueCollection().getCollection().add("(You turn around).");

        }

    }

}
