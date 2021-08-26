package com.polymorphism;

public class Book {
    private int id;
    private String title;
    private Page[] pages;
    private boolean isBorrowed;

    public Book(int id, String title, Page[] pages){
        this.id=id;
        this.title=title;
        this.pages=pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Page[] getPages() {
        return pages;
    }

    public void setPages(Page[] pages) {
        this.pages = pages;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getShortPlot(){
        return "Basic plot";
    }
}
