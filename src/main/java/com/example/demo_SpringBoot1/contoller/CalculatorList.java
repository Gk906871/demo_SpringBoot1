package com.example.demo_SpringBoot1.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class CalculatorList {

    @RequestMapping("/add")
    public String Addition(){

        Scanner scanner = new Scanner(System.in);

        int a =scanner.nextInt();
        int b =scanner.nextInt();

        return "This Is A Addition" +(a+b);
    }
    @RequestMapping("/sub")
    public String Subtraction(){

        Scanner scanner =new Scanner(System.in);
        int a =scanner.nextInt();
        int b =scanner.nextInt();

        return "This Is a Subtraction"+(a-b);


    }
    @RequestMapping("/mul")
    public String multiply(){

        Scanner scanner= new Scanner(System.in);

        int a =scanner.nextInt();
        int b =scanner.nextInt();

        return "This Is A Multiply"+(a*b);

    }
    @RequestMapping("/div")
    public String divide(){

        Scanner scanner = new Scanner(System.in );
        int a =scanner.nextInt();
        int b =scanner.nextInt();

        return "This Is a Divide"+(a/b);
    }

}
