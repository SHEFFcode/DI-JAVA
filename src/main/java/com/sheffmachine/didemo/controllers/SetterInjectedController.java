package com.sheffmachine.didemo.controllers;

import com.sheffmachine.didemo.services.GreetingService;
import com.sheffmachine.didemo.services.GreetingServiceImpl;

public class SetterInjectedController {
    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
