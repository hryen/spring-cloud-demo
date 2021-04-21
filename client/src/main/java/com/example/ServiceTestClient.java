package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-test", fallback = ServiceTestFallBack.class)
public interface ServiceTestClient {

    @GetMapping
    String test();
}
