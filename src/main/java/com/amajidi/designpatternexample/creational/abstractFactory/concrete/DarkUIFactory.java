package com.amajidi.designpatternexample.creational.abstractFactory.concrete;

import org.springframework.context.annotation.Configuration;

import com.amajidi.designpatternexample.creational.abstractFactory.Button;
import com.amajidi.designpatternexample.creational.abstractFactory.UIAbstractFactory;
import com.amajidi.designpatternexample.creational.abstractFactory.Window;

@Configuration
public class DarkUIFactory implements UIAbstractFactory {

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new DarkButton();
    }

    @Override
    public Window createWindow() {
        // TODO Auto-generated method stub
        return new DarkWindow();
    }
    
}
