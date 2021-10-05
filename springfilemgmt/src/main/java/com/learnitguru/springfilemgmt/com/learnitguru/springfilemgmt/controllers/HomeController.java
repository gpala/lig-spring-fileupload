package com.learnitguru.springfilemgmt.com.learnitguru.springfilemgmt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Env;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @Autowired
    Environment env;

    @GetMapping("/")
    public String welcome(){
        return env.toString();
    }
    
}
