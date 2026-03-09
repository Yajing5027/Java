package com.oop.interfaces;

public class TableTennisPlayer extends Sport implements TableTennis{

    public TableTennisPlayer() {
    }
    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("I can speak English.");
        
    }
    @Override
    public void tableTennis() {
        System.out.println("I play table tennis.");
        
    }
}
