package com.demo.controller;

import com.demo.service.Services;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RestApi {
    private final Services services;
    @GetMapping("api/v1/{id}")
    public String getName(@PathVariable String name) {
        return services.getName(name);
    }
}