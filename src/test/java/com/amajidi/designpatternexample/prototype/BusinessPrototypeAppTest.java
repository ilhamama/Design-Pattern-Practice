package com.amajidi.designpatternexample.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = BusinessPrototypeApp.class)
public class BusinessPrototypeAppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testPrototype() {
        Business personal = applicationContext.getBean("personalBusinessProtoytpe", Business.class);
        personal.setName("Personal Business");

        Business corporate = applicationContext.getBean("corporateBusinessProtoytpe", Business.class);
        corporate.setName("PT.Business, Tbk");

        Business international = applicationContext.getBean("internationalBusinessProtoytpe", Business.class);
        international.setName("Business Ltd.");

        System.out.println(personal);
        System.out.println(corporate);
        System.out.println(international);
    }
}
