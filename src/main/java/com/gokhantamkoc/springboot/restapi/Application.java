package com.gokhantamkoc.springboot.restapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Gokhan Tamkoc on 19.08.2017.
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.gokhantamkoc.springrestservice.hello")
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String... args) {
        try {
            SpringApplication.run(Application.class, args);
        }
        catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}
