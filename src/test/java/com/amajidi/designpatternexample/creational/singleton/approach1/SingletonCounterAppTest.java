package com.amajidi.designpatternexample.creational.singleton.approach1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.amajidi.designpatternexample.creational.singleton.approach1.Counter;
import com.amajidi.designpatternexample.creational.singleton.approach1.SingletonCounterApp;

@SpringBootTest(classes = SingletonCounterApp.class)
public class SingletonCounterAppTest {

    @Autowired
    private ApplicationContext applicationContext;
    
    @Test
    public void singletonTest() {
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean("getCounter", Counter.class);

        counter1.count();
        counter2.count();

        System.out.println("Counter 1 : " + counter1.getValue());
        System.out.println("Counter 2 : " + counter2.getValue());
    }

    @Test
    public void asyncRaceCondition() throws InterruptedException {
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);

        asyncCount(counter1, 100_000);
        asyncCount(counter2, 100_000);

        Thread.sleep(3_000L);

        System.out.println("Async Counter 1 : " + counter1.getValue());
        System.out.println("Async Counter 2 : " + counter2.getValue());
    }

    @Test
    public void syncRaceCondition() throws InterruptedException {
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);

        syncCount(counter1, 100_000);
        syncCount(counter2, 100_000);

        Thread.sleep(3_000L);

        System.out.println("Sync Counter 1 : " + counter1.getValue());
        System.out.println("Sync Counter 2 : " + counter2.getValue());
    }

    @BeforeEach
    public void resetSingleton() {
        Counter counter = applicationContext.getBean(Counter.class);
        counter.reset();
    }

    private void asyncCount(Counter counter, int total) {
        new Thread(() -> {
            for (int i = 0; i < total; i++) {
                counter.count();
            }
        }).start();
    }

    private void syncCount(Counter counter, int total) {
        new Thread(() -> {
            for (int i = 0; i < total; i++) {
                counter.synchronizedCount();
            }
        }).start();
    }
}
