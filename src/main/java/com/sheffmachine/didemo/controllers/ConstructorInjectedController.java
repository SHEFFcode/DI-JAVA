package com.sheffmachine.didemo.controllers;

import com.sheffmachine.didemo.services.GreetingService;

public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
