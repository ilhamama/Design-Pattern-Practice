package com.amajidi.designpatternexample.creational.abstractFactory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.amajidi.designpatternexample.creational.abstractFactory.Button;
import com.amajidi.designpatternexample.creational.abstractFactory.UIAbstractFactory;
import com.amajidi.designpatternexample.creational.abstractFactory.UIFactoryApp;
import com.amajidi.designpatternexample.creational.abstractFactory.Window;
import com.amajidi.designpatternexample.creational.abstractFactory.concrete.DarkUIFactory;
import com.amajidi.designpatternexample.creational.abstractFactory.concrete.LightUIFactory;

@SpringBootTest(classes = UIFactoryApp.class)
public class UIFactoryTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testFactory() {
        UIAbstractFactory lightUI = applicationContext.getBean(LightUIFactory.class);
        Button lightButton = lightUI.createButton();
        Window lightWindow = lightUI.createWindow();
        UIAbstractFactory darkUI = applicationContext.getBean(DarkUIFactory.class);
        Button darkButton = darkUI.createButton();
        Window darkWindow = darkUI.createWindow();

        System.out.println(lightButton.getComponent() + " Color : " + lightButton.getColor());
        System.out.println(lightWindow.getComponent() + " Size : " + lightWindow.getSize());
        System.out.println(darkButton.getComponent() + " Color : " + lightButton.getColor());
        System.out.println(darkWindow.getComponent() + " Size : " + lightWindow.getSize());
    }

}
