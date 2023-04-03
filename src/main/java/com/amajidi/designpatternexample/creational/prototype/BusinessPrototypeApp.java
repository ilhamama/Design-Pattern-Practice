package com.amajidi.designpatternexample.creational.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class BusinessPrototypeApp {

    @Bean
    @Scope("prototype")
    public Business personalBusinessProtoytpe() {
        return new Business("Indonesia", BusinessType.PERSONAL);
    }

    @Bean
    @Scope("prototype")
    public Business corporateBusinessProtoytpe() {
        return new Business("Indonesia", BusinessType.CORPORATE);
    }

    @Bean
    @Scope("prototype")
    public Business internationalBusinessProtoytpe() {
        return new Business("Luar Negeri", BusinessType.INTERNATIONAL);
    }
}
