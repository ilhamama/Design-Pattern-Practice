package com.amajidi.designpatternexample.creational.factory;

public interface SocialMedia {
    public String getName();
    public void setName(String name);
    public String getUrl();
    public SocialMediaType getType();
}
