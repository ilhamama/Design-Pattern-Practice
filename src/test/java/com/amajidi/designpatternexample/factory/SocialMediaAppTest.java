package com.amajidi.designpatternexample.factory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = SocialMediaApp.class)
public class SocialMediaAppTest {
    @Autowired
    private ApplicationContext applicationContext;

    // TIP : Shift + Alt + A to toggle block comment in VSCode
    /* @Test
    public void factoryMethodApproach1Tests() {
        SocialMedia facebook = applicationContext.getBean(SocialMedia.class, SocialMediaType.FACEBOOK);
        facebook.setName("FB Ilham Amajidi");

        SocialMedia instagram = applicationContext.getBean(SocialMedia.class, SocialMediaType.INSTAGRAM);
        instagram.setName("IG Ilham Amajidi");

        System.out.println(facebook.getType() + " : " + facebook.getUrl() + " || " + facebook.getName());
        System.out.println(instagram.getType() + " : "  + instagram.getUrl() + " || " + instagram.getName());
    } */

    @Test
    public void factoryMethodApproach2Tests() {
        SocialMedia facebook = applicationContext.getBean("facebookSocialMedia", SocialMedia.class);
        facebook.setName("FB Ilham Amajidi");

        SocialMedia instagram = applicationContext.getBean("instagramSocialMedia", SocialMedia.class);
        instagram.setName("IG Ilham Amajidi");

        System.out.println(facebook.getType() + " : " + facebook.getUrl() + " || " + facebook.getName());
        System.out.println(instagram.getType() + " : "  + instagram.getUrl() + " || " + instagram.getName());
    }
}
