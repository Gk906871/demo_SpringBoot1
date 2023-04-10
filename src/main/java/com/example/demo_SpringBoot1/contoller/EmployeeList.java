package com.example.demo_SpringBoot1.contoller;

import com.example.demo_SpringBoot1.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeList {

    @RequestMapping("/employee")
    public ArrayList<Employee> create(){

        ArrayList<Employee>employees = new ArrayList<>();

        Employee employee1 = new Employee("Rahul Singh ",23, "Cs",67855.87);
        Employee employee2 = new Employee("Shiva singh",21,"It",78679.78);
        Employee employee3 = new Employee("Mohit singh",24,"IIT",76859.90);
        Employee employee4 = new Employee("Ramesh Singh",25,"Info",67896.89);
        Employee employee5 = new Employee("Sourav Singh",27,"Wipro",67584.87);


        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);


        return employees;


    }


}
