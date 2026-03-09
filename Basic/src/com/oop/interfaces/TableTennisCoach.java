package com.oop.interfaces;

public class TableTennisCoach extends Sport implements TableTennis{
    public TableTennisCoach() {
    }
    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("I can speak English.");
        
    }
    @Override
    public void tableTennis() {
        System.out.println("I teach table tennis.");
        
    }
}
