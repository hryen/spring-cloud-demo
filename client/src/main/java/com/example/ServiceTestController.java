package com.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTestController {

    private final ServiceTestClient serviceTestClient;

    public ServiceTestController(@Qualifier("com.example.ServiceTestClient") ServiceTestClient serviceTestClient) {
        this.serviceTestClient = serviceTestClient;
    }

    @GetMapping
    public String test() {
        return serviceTestClient.test();
    }
}
