package com.amajidi.designpatternexample.creational.abstractFactory.concrete;

import com.amajidi.designpatternexample.creational.abstractFactory.WebComponent;
import com.amajidi.designpatternexample.creational.abstractFactory.Window;

import lombok.Getter;

public class LightWindow implements Window {
    
    @Getter
    private final String size = "100px";

    @Getter
    private final WebComponent component = WebComponent.WINDOW;
}
