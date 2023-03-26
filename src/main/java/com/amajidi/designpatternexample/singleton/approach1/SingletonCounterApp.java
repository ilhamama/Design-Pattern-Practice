package com.amajidi.designpatternexample.singleton.approach1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SingletonCounterApp {
    @Bean
    public Counter getCounter() {
        return new Counter();
    }
}
