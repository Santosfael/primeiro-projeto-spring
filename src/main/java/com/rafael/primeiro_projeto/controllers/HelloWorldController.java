package com.rafael.primeiro_projeto.controllers;

import com.rafael.primeiro_projeto.model.User;
import com.rafael.primeiro_projeto.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

//    @Autowired
//    private AmazonS3 amazonS3;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Rafael");
    }

    @PostMapping
    public String helloWorldPost(@RequestBody User body) {
        return "Hello World " + body.getName();
    }
}
