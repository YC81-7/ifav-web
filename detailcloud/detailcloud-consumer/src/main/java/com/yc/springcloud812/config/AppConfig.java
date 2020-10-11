package com.yc.springcloud812.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


//配置类:由spring托管
@SpringBootApplication
public class AppConfig {

    @Bean //创建一个 restTemplate 的模板操作对象
    // @LoadBalanced       //启动ribbon客户端负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
