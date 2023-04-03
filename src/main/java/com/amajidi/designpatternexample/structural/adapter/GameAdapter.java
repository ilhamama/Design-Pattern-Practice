package com.amajidi.designpatternexample.structural.adapter;

public class GameAdapter extends Movie {
    private Game game;

    public GameAdapter(Game game) {
        this.game = game;
    }

    @Override
    public String getDirector() {
        // TODO Auto-generated method stub
        return game.getDeveloper();
    }

    @Override
    public String getRating() {
        // TODO Auto-generated method stub
        return game.getScore().toString();
    }

    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return game.getTitle();
    }

    
}
