package com.nacos.provider.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-provider")
public interface ProviderFeign {

    @RequestMapping(value = "pro/rest",method = RequestMethod.GET)
    public String rest();
}
