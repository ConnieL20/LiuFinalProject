package com.example.liufinalproject;

public class Character {
    //private instance variables
    private String name;
    private int appearancePlace;
    private int meter;

    public Character(){
        name = "null";
        appearancePlace = 0;
        meter = 100;
    }

    //getter and setter methods
    public String getName(){
        return name;
    }

    public int getAppearancePlace(){
        return appearancePlace;
    }

    public int getMeter(){
        return meter;
    }

    public void subtractMeter(int value){
        meter -= value;
    }

    public void setName(String currentName){
        name = currentName;
    }

    public void setAppearancePlace(int place){
        appearancePlace = place;
    }
}
