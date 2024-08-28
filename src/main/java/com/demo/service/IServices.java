package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class IServices implements Services{

    @Override
    public String getName(String name) {
        return "Tu nombre es : " + name;
    }

}
