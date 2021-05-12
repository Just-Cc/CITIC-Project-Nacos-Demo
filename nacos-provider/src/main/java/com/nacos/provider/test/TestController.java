package com.nacos.provider.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prov")
public class TestController {

    @RequestMapping(value = "rest",method = RequestMethod.GET)
    public String rest(){

        System.out.println("provider正在被调用");

        return "HelloWorld!Provider";
    }
}
