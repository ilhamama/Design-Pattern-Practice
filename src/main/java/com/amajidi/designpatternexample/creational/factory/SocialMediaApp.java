package com.amajidi.designpatternexample.creational.factory;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.amajidi.designpatternexample.creational.factory.concrete.FacebookSocialMedia;
import com.amajidi.designpatternexample.creational.factory.concrete.InstagramSocialMedia;

@SpringBootApplication
public class SocialMediaApp {
    
    // Approach 1 : Create method to determine which concrete class to create as object
    // TIP : Shift + Alt + A to toggle block comment in VSCode
    /* @Bean
    @Scope("prototype")
    public SocialMedia socialMedia(SocialMediaType type) {
        switch (type) {
            case INSTAGRAM:
                return new InstagramSocialMedia();
            case FACEBOOK:
                return new FacebookSocialMedia();
            default:
                throw new IllegalArgumentException("Unsupported Social Media Type");
        }
    } */

    // Approach 2 : Create methods for each concrete class. This is preferred solution.
    @Bean
    @Scope("prototype")
    public SocialMedia instagramSocialMedia() {
        return new InstagramSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia facebookSocialMedia() {
        return new FacebookSocialMedia();
    }
}
