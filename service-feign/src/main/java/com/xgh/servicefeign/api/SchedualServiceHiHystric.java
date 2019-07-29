package com.xgh.servicefeign.api;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created by XGH on 2019/7/28
 */
@Component
public class SchedualServiceHiHystric /*implements SchedualServiceHi */ implements FallbackFactory<SchedualServiceHi> {
   /* @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }*/

   //不直接实现接口，而是实现Fallrollback
    @Override
    public SchedualServiceHi create(Throwable throwable) {
        return new SchedualServiceHi(){
            @Override
            public String sayHiFromClientOne(String name) {
               return "sorry" + name;
            }
        };
    }
}
