package com.amajidi.designpatternexample.creational.abstractFactory.concrete;

import com.amajidi.designpatternexample.creational.abstractFactory.Button;
import com.amajidi.designpatternexample.creational.abstractFactory.WebComponent;

import lombok.Getter;

public class DarkButton implements Button {
    
    @Getter
    private final String color = "#000000";

    @Getter
    private final WebComponent component = WebComponent.BUTTON;
}
