package com.amajidi.designpatternexample.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Business {
    private String name;
    private String location;
    private BusinessType type;
    
    public Business(String location, BusinessType type) {
        this.location = location;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Business [name=" + name + ", location=" + location + ", type=" + type + "]";
    }
}
