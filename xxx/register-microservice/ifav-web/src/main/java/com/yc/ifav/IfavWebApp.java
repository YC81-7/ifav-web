package com.yc.ifav;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.yc.ifav.feign")      // 这样feign可以扫描这个路径下的接口@Feignclient的接口，并生成动态代理对象
@SpringBootApplication
public class IfavWebApp {

    public static void main(String[] args) {
        SpringApplication.run(IfavWebApp.class, args);
    }


}
