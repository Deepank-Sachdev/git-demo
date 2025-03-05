package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/hello")
    public String SayHello(){
        return "Hello";
    }

    @RequestMapping("/hello/{name}")
    public String SayHello(@PathVariable String name){
        return "Hello " + name;
    }

}

@re