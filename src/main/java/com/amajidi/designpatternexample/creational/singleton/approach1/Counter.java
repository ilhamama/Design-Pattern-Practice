package com.amajidi.designpatternexample.creational.singleton.approach1;

import lombok.Getter;

public class Counter {

    @Getter
    private Long value = 0L;

    public void count() {
        value++;
    }
    
    public synchronized void synchronizedCount() {
        value++;
    }

    // Used only for test purpose
    public void reset() {
        value = 0L;
    }
}
