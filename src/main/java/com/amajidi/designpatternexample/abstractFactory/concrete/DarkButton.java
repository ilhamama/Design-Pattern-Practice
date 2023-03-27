package com.amajidi.designpatternexample.abstractFactory.concrete;

import com.amajidi.designpatternexample.abstractFactory.Button;
import com.amajidi.designpatternexample.abstractFactory.WebComponent;

import lombok.Getter;

public class DarkButton implements Button {
    
    @Getter
    private final String color = "#000000";

    @Getter
    private final WebComponent component = WebComponent.BUTTON;
}
