package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "Hello Jenkins!";
    }

    @GetMapping("/test1")
    public String test1(){
        return "Hello Jenkins1!";
    }
}
