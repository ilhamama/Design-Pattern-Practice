package com.amajidi.designpatternexample.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private String title;
    private String director;
    private String rating;
}
