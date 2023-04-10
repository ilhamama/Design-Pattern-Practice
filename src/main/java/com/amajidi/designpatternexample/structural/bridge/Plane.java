package com.amajidi.designpatternexample.structural.bridge;

public class Plane implements Vehicle {

    private Integer speed = 0;
    private VehiclePurposes vehiclePurposes;    

    public Plane(VehiclePurposes vehiclePurposes) {
        this.vehiclePurposes = vehiclePurposes;
    }

    @Override
    public Integer getCurrentSpeed() {
        System.out.println("Current speed is " + speed + " mach");
        return speed;
    }

    @Override
    public void slowDown(Integer speed) {
        if (speed > this.speed) {
            speed = this.speed;
        } 
        this.speed -= speed;
        System.out.println("Plane slowed down to " + this.speed + " mach");
    }

    @Override
    public void speedUp(Integer speed) {
        this.speed += speed;
        System.out.println("Plane sped up to " + this.speed + " mach");
    }

    @Override
    public void boardPassangers() {
        vehiclePurposes.boardPassangers(120);
    }

    @Override
    public void dropOffPassangers() {
        vehiclePurposes.dropOffPassangers(120);
    }

    @Override
    public void getPassangerType() {
        vehiclePurposes.getPassangerType();
    }

    public void takeOff() {
        speedUp(3);
        System.out.println("The plane take off successfully");
    }

    public void land() {
        slowDown(2);
        System.out.println("The plane landed safely");
    }
    
}
