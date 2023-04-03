package com.amajidi.designpatternexample.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private String title;
    private String developer;
    private Double score;
}
