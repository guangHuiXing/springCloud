package com.example.serviceribbon.controller;

import com.example.serviceribbon.service.HelloWorld;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by XGH on 2019/7/28
 */
@RestController
public class HelloController {
    @Autowired
    HelloWorld helloWorld;

    @GetMapping("/hi")
    public String hi(String name) {
        return helloWorld.hiService(name);
    }
}
