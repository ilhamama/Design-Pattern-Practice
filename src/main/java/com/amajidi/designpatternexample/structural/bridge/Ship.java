package com.amajidi.designpatternexample.structural.bridge;

public class Ship implements Vehicle {

    private Integer speed = 0;
    private VehiclePurposes vehiclePurposes;    

    public Ship(VehiclePurposes vehiclePurposes) {
        this.vehiclePurposes = vehiclePurposes;
    }

    @Override
    public Integer getCurrentSpeed() {
        System.out.println("Current speed is " + speed + " knot");
        return speed;
    }

    @Override
    public void slowDown(Integer speed) {
        if (speed > this.speed) {
            speed = this.speed;
        } 
        this.speed -= speed;
        System.out.println("Ship slowed down to " + this.speed + " knot");
    }

    @Override
    public void speedUp(Integer speed) {
        this.speed += speed;
        System.out.println("Ship sped up to " + this.speed + " knot");
    }

    @Override
    public void boardPassangers() {
        vehiclePurposes.boardPassangers(250);
    }

    @Override
    public void dropOffPassangers() {
        vehiclePurposes.dropOffPassangers(250);
    }

    @Override
    public void getPassangerType() {
        vehiclePurposes.getPassangerType();
    }

    
    
}
