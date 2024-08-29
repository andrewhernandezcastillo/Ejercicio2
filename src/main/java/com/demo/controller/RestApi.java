package com.demo.controller;

import com.demo.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestApi {
    @Autowired
    private Services services;

    @GetMapping("api/v1/{name}")
    public String getName(@PathVariable String name) {
        return services.getName(name);
    }
}