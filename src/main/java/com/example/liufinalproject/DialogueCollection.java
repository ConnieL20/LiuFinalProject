package com.example.liufinalproject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DialogueCollection {

    //instance variables
    private ArrayList<String> collection;

    public DialogueCollection(ArrayList<String> collection){
        this.collection = collection;
    }

    public int getLen(){
        return collection.size();
    }

    public ArrayList<String> getCollection(){
        return collection;
    }

}
