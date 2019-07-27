package com.xgh.servicefeign.controller;

import com.xgh.servicefeign.api.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by XGH on 2019/7/28
 */
@RestController
public class HelloController {
    @Autowired
    SchedualServiceHi helloWorld;

    @GetMapping("/hi")
    public String hi(String name) {
        System.out.println(name);
        return helloWorld.sayHiFromClientOne(name);
    }
}
