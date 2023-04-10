package com.amajidi.designpatternexample.structural.bridge;

public interface Vehicle {
    public void speedUp(Integer speed);
    public void slowDown(Integer speed);
    public Integer getCurrentSpeed();
    public void boardPassangers();
    public void dropOffPassangers();
    public void getPassangerType();
}
