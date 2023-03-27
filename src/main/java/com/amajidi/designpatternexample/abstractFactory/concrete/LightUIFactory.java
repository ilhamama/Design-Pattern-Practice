package com.amajidi.designpatternexample.abstractFactory.concrete;

import org.springframework.context.annotation.Configuration;

import com.amajidi.designpatternexample.abstractFactory.Button;
import com.amajidi.designpatternexample.abstractFactory.UIAbstractFactory;
import com.amajidi.designpatternexample.abstractFactory.Window;

@Configuration
public class LightUIFactory implements UIAbstractFactory {

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new LightButton();
    }

    @Override
    public Window createWindow() {
        // TODO Auto-generated method stub
        return new LightWindow();
    }
    
}
