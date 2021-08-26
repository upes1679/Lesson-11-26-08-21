package com.polymorphism;

public class PercyJackson extends Book{
    public PercyJackson(int id, String title, Page[] pages) {
        super(id, title, pages);
    }

    public String getShortPlot(){
        return "Percy Jackson Plot";
    }

    public void method(){

    }
}
