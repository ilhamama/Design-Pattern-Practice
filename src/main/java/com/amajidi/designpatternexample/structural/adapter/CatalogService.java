package com.amajidi.designpatternexample.structural.adapter;

import org.springframework.stereotype.Component;

@Component
public class CatalogService {
    public void display(Movie movie) {
        System.out.println(movie.getTitle() + " by " + movie.getDirector());
    }
}
