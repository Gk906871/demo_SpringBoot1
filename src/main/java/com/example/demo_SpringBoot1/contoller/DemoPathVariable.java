package com.example.demo_SpringBoot1.contoller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoPathVariable {


    @RequestMapping("/mag/{name}")
    public String massage(@PathVariable String name) {

        return "Welcome To Spring Boot Application" + name;


    }

    @RequestMapping("/student/{name}/{section}/{rollNo}")
    public String studentInfo(@PathVariable String name, @PathVariable String section, @PathVariable int rollNo) {

        return "Students Name Is : " + name + " Students Section Is : " + section + " Students Roll Number Is :";

    }

    @RequestMapping("/verify_age/{age}")
    public String verifyAge(@PathVariable int age) {

        if (age<18) {

            return "Person Is Child";

        }else if (age>18 & age<30){

            return "Person Is Young";

        }else  {

            return "Person Is Old";
        }
    }



}





