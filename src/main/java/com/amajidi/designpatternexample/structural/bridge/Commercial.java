package com.amajidi.designpatternexample.structural.bridge;

public class Commercial implements VehiclePurposes {
    private Integer passangers = 0;
    private String station; 

    public Commercial(String station) {
        this.station = station;
    }

    @Override
    public Integer boardPassangers(Integer passangers) {
        this.passangers += passangers;
        System.out.println("Board " + passangers + " " + getPassangerType() + " on " + station);
        return this.passangers;
    }

    @Override
    public Integer dropOffPassangers(Integer passangers) {
        this.passangers += passangers;
        System.out.println("Drop off " + passangers + " " + getPassangerType() + " on " + station);
        return this.passangers;
    }

    @Override
    public String getPassangerType() {
        return "Container";
    }
    
}
