package com.amajidi.designpatternexample.creational.abstractFactory.concrete;

import com.amajidi.designpatternexample.creational.abstractFactory.Button;
import com.amajidi.designpatternexample.creational.abstractFactory.WebComponent;

import lombok.Getter;

public class LightButton implements Button {
    
    @Getter
    private final String color = "#ffffff";

    @Getter
    private final WebComponent component = WebComponent.BUTTON;
}
