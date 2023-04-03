package com.amajidi.designpatternexample.creational.factory.concrete;

import com.amajidi.designpatternexample.creational.factory.SocialMedia;
import com.amajidi.designpatternexample.creational.factory.SocialMediaType;

import lombok.Getter;
import lombok.Setter;

public class FacebookSocialMedia implements SocialMedia {
    
    @Getter
    @Setter
    private String name;

    @Override
    public SocialMediaType getType() {
        return SocialMediaType.FACEBOOK;
    }

    @Override
    public String getUrl() {
        return "https://www.facebook.com";
    }
    
}
