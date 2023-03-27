package com.amajidi.designpatternexample.abstractFactory.concrete;

import com.amajidi.designpatternexample.abstractFactory.WebComponent;
import com.amajidi.designpatternexample.abstractFactory.Window;

import lombok.Getter;

public class DarkWindow implements Window {
    
    @Getter
    private final String size = "150px";

    @Getter
    private final WebComponent component = WebComponent.WINDOW;
}
