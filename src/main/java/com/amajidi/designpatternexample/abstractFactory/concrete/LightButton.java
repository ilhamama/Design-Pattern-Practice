package com.amajidi.designpatternexample.abstractFactory.concrete;

import com.amajidi.designpatternexample.abstractFactory.Button;
import com.amajidi.designpatternexample.abstractFactory.WebComponent;

import lombok.Getter;

public class LightButton implements Button {
    
    @Getter
    private final String color = "#ffffff";

    @Getter
    private final WebComponent component = WebComponent.BUTTON;
}
