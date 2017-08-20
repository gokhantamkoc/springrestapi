package com.gokhantamkoc.springboot.restapi.controller;

import com.gokhantamkoc.springboot.restapi.model.Greeting;
import com.gokhantamkoc.springboot.restapi.model.Movie;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Gokhan Tamkoc on 19.08.2017.
 */

@RestController
@RequestMapping(value = "/api")
public class GreetingController {
    private final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private GsonBuilder gsonBuilder;
    private Gson gson;

    @Autowired
    public GreetingController(GsonBuilder gsonBuilder) {
        this.gsonBuilder = gsonBuilder;
        gson = this.gsonBuilder.create();
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.GET )
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping(value = "/movie", produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.POST)
    public ResponseEntity<?> logMovie(@RequestBody Movie movie) {
        LOGGER.info(gson.toJson(movie));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
