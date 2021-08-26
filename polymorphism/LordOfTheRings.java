package com.polymorphism;

public class LordOfTheRings extends Book {
    public LordOfTheRings(int id, String title, Page[] pages) {
        super(id, title, pages);
    }

    public String getShortPlot(){
        return "Lord of the rings plot";
    }
}
