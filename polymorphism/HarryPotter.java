package com.polymorphism;

public class HarryPotter extends Book{
    public HarryPotter(int id, String title, Page[] pages) {
        super(id, title, pages);
    }

    @Override
    public String getShortPlot(){
        return "Harry Potter Plot";
    }

    public void specialMethod(){

    }
}
