package com.amajidi.designpatternexample.factory.concrete;

import com.amajidi.designpatternexample.factory.SocialMedia;
import com.amajidi.designpatternexample.factory.SocialMediaType;

import lombok.Getter;
import lombok.Setter;

public class InstagramSocialMedia implements SocialMedia {
    
    @Getter
    @Setter
    private String name;

    @Override
    public SocialMediaType getType() {
        return SocialMediaType.INSTAGRAM;
    }

    @Override
    public String getUrl() {
        return "https://www.instagram.com";
    }
    
}
