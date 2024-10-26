package com.neoteric.demo.controller;

import com.neoteric.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class DemoController {
    @Autowired
    DemoService demoService;

    @PostMapping (value = "/api/searchAccount",
            consumes = "application/json",
            produces = "application/json" )
    public String demo(){
    return demoService.demoClass();
     }
}
