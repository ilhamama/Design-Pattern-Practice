package com.amajidi.designpatternexample.creational.abstractFactory.concrete;

import com.amajidi.designpatternexample.creational.abstractFactory.WebComponent;
import com.amajidi.designpatternexample.creational.abstractFactory.Window;

import lombok.Getter;

public class DarkWindow implements Window {
    
    @Getter
    private final String size = "150px";

    @Getter
    private final WebComponent component = WebComponent.WINDOW;
}
