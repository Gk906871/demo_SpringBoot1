package com.example.demo_SpringBoot1.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo_Con {

    @RequestMapping("/hello")
    public void hello(){

        System.out.println("This is A My First Spring boot Code : ");

    }

    @RequestMapping("/msg")
    public String Massage(){

        return "This Is a String method : ";
    }


}
