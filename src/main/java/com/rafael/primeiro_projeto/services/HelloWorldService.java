package com.rafael.primeiro_projeto.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloWorld(String name) {
        return "Olá mundo, " + name;
    }
}
