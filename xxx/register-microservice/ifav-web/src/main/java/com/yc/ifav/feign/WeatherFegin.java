package com.yc.ifav.feign;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


// feign客户端要访问的是  zuul服务 BASE-MICROSERVICE-ZUUL-GATEWAY
@FeignClient(name = "IFAV-PROVIDER-WEATHER")  // 配置要按自定义的类FeignClientConfig
@EnableDiscoveryClient
public interface WeatherFegin {


    @RequestMapping(value = "weather/getWeather", method = RequestMethod.POST)
    String get(@RequestParam("province") String province,@RequestParam("city") String city) ;


}

