package com.example;

import org.springframework.stereotype.Component;

@Component
public class ServiceTestFallBack implements ServiceTestClient {

    @Override
    public String test() {
        return "service test fallback.";
    }
}
