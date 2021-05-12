package com.nacos.consumer.test;

import com.nacos.provider.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consum")
public class TestController {

    @Autowired
    ProviderFeign feign;

    @RequestMapping(value = "rest",method = RequestMethod.GET)
    public String rest(){

        String result = feign.rest();
        System.out.println("consumer正在通过feign调用provider的接口，返回的Result为："+result);

        return result;
    }
}
