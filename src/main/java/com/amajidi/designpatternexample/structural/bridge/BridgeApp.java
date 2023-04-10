package com.amajidi.designpatternexample.structural.bridge;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgeApp {

    public static void main(String[] args) {
        testBridge(new Military("Military Base"));
        testBridge(new Commercial("Warehouse"));
    }

    private static void testBridge(VehiclePurposes purposes) {
        Car car = new Car(purposes);
        car.boardPassangers();
        car.speedUp(50);
        car.slowDown(30);
        car.slowDown(20);
        car.dropOffPassangers();

        System.out.println();

        Plane plane = new Plane(purposes);
        plane.boardPassangers();
        plane.speedUp(1);
        plane.takeOff();
        plane.land();
        plane.slowDown(2);
        plane.dropOffPassangers();

        System.out.println("\n\n");
    }
}
