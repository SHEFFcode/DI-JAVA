package com.sheffmachine.didemo.controllers;

import com.sheffmachine.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
