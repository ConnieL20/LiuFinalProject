package com.example.liufinalproject;

import javafx.event.ActionEvent;

import java.io.IOException;

public class MageController extends SceneController {
    public MageController(){
        super();
        addDialogues();
        addIndexes();
        getCurrentCharacter().setName("Merlin");
        setNextFXML1("Death.fxml");
        setNextFXML2("Hallway.fxml");
        setDialogueResult1("I'm sorry...you are truly a nice person. In fact, probably the nicest one in this world so far.");
        setDialogueResult2("...Ok, I accept. But I will leave if I ever feel too overwhelmed.");
    }

    @Override
    public void addDialogues(){
        getDialogueCollection().getCollection().add("^^Well, hello there!^^");
        getDialogueCollection().getCollection().add("OH SHI—I'm so sorry! I-I don't know what came over me to just break into your house.");
        getDialogueCollection().getCollection().add("(Bob! Bob! Are you there)?");
        getDialogueCollection().getCollection().add("(No response. Before you could ponder in confusion, the man cuts in).");
        getDialogueCollection().getCollection().add("^^Not at all! My name is Merlin. My home is opened to all venturing travelers.^^");
        getDialogueCollection().getCollection().add("^^You are not the first of your kind. Please, you look famished and tired. Sit down and tell me of your adventures.^^");
        getDialogueCollection().getCollection().add("(Wow...he has such a relaxing aura. It's been a while since I've felt so at ease).");
        getDialogueCollection().getCollection().add("Thank you so much...ever since I came here everything has just been so hectic. You got some tea?");
        getDialogueCollection().getCollection().add("^^Of course. Take a seat, have some tea, and talk.^^");
        getDialogueCollection().getCollection().add("(You do as he says and take a nice long sip of your tea. When you finish, you look up and wait for him to say\nsomething. Anything.).");
        getDialogueCollection().getCollection().add("Why do you keep staring at me? Is there something on my face?");
        getDialogueCollection().getCollection().add("^^No no, nothing at all. It is just...surreal that such a perfect divine being as you has graced me with your\nmere human presence. Such beauty! Such wonder!^^");
        getDialogueCollection().getCollection().add("O-oh I see...t-thank you?");
        getDialogueCollection().getCollection().add("^^Please do not shower me with your thanks. It is I, who should thank you. Please just speak as you will. I just\nwant to watch you and listen to you talk forever.^^");
        getDialogueCollection().getCollection().add("(You try to lighten up the mood a bit).");
        getDialogueCollection().getCollection().add("Haha, you're too kind. I obviously can't stay here forever with you!");
        getDialogueCollection().getCollection().add("^^Why not?^^");
        getDialogueCollection().getCollection().add("Excuse me?");
        getDialogueCollection().getCollection().add("^^You should stay here with me. I can take care of you. If anyone or anything ever touches a single hair on you...^^");
        getDialogueCollection().getCollection().add("(Faster than you could blink, he zaps your tea-cup sitting on the table).");
        getDialogueCollection().getCollection().add("^^...see? I can protect you forever. That tea-cup burned you hence it does not deserve to exist.^^");
        getDialogueCollection().getCollection().add("???");
    }

    @Override
    public void addIndexes(){
        getNeedChoice().add(22);
    }

    @Override
    public void choiceResponse(ActionEvent e) throws IOException {
        super.choiceResponse(e);

        if (getSelectedChoice() == 1){
            getDialogueCollection().getCollection().add("^^...why does it sound like you are saying goodbye?^^");
            getDialogueCollection().getCollection().add("Well...because I am.");
            getDialogueCollection().getCollection().add("^^No.^^");
            getDialogueCollection().getCollection().add("I'm sorry. I really am but I'm just not into—");
            getDialogueCollection().getCollection().add("^^If I can't have you..^^");
            getDialogueCollection().getCollection().add("^^...then nobody will.^^");
            getDialogueCollection().getCollection().add("You have been locked and captured by " + getCurrentCharacter().getName() + "'s possessiveness.");
        } else {
            getDialogueCollection().getCollection().add("(Merlin's face brightens up the room so much that it blinds you).");
            getDialogueCollection().getCollection().add("(You realize that you've been blinded a lot ever since you came to this world).");
            getDialogueCollection().getCollection().add("^^I am so happy, my love!^^");
            getDialogueCollection().getCollection().add("Yeah...hey, can I get some rest? It's been a while since I've had any peaceful sleep.");
            getDialogueCollection().getCollection().add("^^Of course, of course. Walk down the hallway and make a left. I had everything prepared before you came.^^");
            getDialogueCollection().getCollection().add("(Weirdo).");
            getDialogueCollection().getCollection().add("(You keep your thoughts to yourself and smile).");
            getDialogueCollection().getCollection().add("Thanks! I will see you tomorrow. Totally. Yes.");
            getDialogueCollection().getCollection().add("(Merlin smiles and you begin walking to your room).");

        }

    }
}
