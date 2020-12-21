package com.yc.ifav.feign;


import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.CompletableFuture;

// feign客户端要访问的是  zuul服务 BASE-MICROSERVICE-ZUUL-GATEWAY
@FeignClient(name = "IFAV-PROVIDER-REG")  // 配置要按自定义的类FeignClientConfig
@EnableDiscoveryClient
public interface UserFeign {

//    //访问的路径value要修改成zuul指定的服务路由路径
//    @RequestMapping(method = RequestMethod.GET, value = "/yc-api/piclib-proxy/piclib/{id}")
//    String findById(@RequestParam("id") Integer id);

    @PostMapping("/user/login")
    String login(@RequestParam("uName") String uName,@RequestParam("uPwd") String uPwd, @RequestParam("uEmail") String uEmail ) ;

    @GetMapping("/user/vcode")
    void sendVcode(@RequestParam("uEmail") String uEmail) ;

    @RequestMapping(value = "/user/uploadPic", method = RequestMethod.POST)
    public void uploadPic(@RequestParam("multipartFile") MultipartFile multipartFile, @RequestParam("request") HttpServletRequest request, @RequestParam("response") HttpServletResponse response) ;

    @PostMapping("/user/register")
    String  register(@RequestParam("uName")String uName,@RequestParam("uPwd") String uPwd, @RequestParam("vkey") String vkey);

}