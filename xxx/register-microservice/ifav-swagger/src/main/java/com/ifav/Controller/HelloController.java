package com.ifav.Controller;

import com.ifav.UserTest.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        return new User();
    }
}
