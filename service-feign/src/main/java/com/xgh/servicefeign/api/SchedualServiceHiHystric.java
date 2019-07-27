package com.xgh.servicefeign.api;

import org.springframework.stereotype.Component;

/**
 * Created by XGH on 2019/7/28
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
