package com.amajidi.designpatternexample.structural.bridge;

public interface VehiclePurposes {
    public Integer boardPassangers(Integer passangers);
    public Integer dropOffPassangers(Integer passangers);
    public String getPassangerType();
}
