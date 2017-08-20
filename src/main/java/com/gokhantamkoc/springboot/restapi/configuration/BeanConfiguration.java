package com.gokhantamkoc.springboot.restapi.configuration;

import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Gokhan Tamkoc on 20.08.2017.
 */

@Configuration
public class BeanConfiguration {
    @Bean
    public GsonBuilder gsonBuilder() {
        return new GsonBuilder();
    }
}
