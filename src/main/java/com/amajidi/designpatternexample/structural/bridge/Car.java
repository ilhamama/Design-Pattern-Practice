package com.amajidi.designpatternexample.structural.bridge;

public class Car implements Vehicle {

    private Integer speed = 0;
    private VehiclePurposes vehiclePurposes;    

    public Car(VehiclePurposes vehiclePurposes) {
        this.vehiclePurposes = vehiclePurposes;
    }

    @Override
    public Integer getCurrentSpeed() {
        System.out.println("Current speed is " + speed + " kph");
        return speed;
    }

    @Override
    public void slowDown(Integer speed) {
        if (speed > this.speed) {
            speed = this.speed;
        } 
        this.speed -= speed;
        System.out.println("Car slowed down to " + this.speed + " kph");
    }

    @Override
    public void speedUp(Integer speed) {
        this.speed += speed;
        System.out.println("Car sped up to " + this.speed + " kph");
    }

    @Override
    public void boardPassangers() {
        vehiclePurposes.boardPassangers(1);
    }

    @Override
    public void dropOffPassangers() {
        vehiclePurposes.dropOffPassangers(1);
    }

    @Override
    public void getPassangerType() {
        vehiclePurposes.getPassangerType();
    }

    
    
}
