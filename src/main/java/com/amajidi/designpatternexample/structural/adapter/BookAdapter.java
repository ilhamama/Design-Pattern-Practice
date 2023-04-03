package com.amajidi.designpatternexample.structural.adapter;

public class BookAdapter extends Movie {
    private Book book;

    public BookAdapter(Book book) {
        this.book = book;
    }

    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return book.getTitle();
    }

    @Override
    public String getDirector() {
        // TODO Auto-generated method stub
        return book.getAuthor();
    }

    @Override
    public String getRating() {
        // TODO Auto-generated method stub
        return "No Rating";
    }   
}
