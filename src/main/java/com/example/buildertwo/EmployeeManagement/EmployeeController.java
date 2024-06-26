package com.example.buildertwo.EmployeeManagement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    private final EmployeeService employeeService;


    public EmployeeController(EmployeeRepository employeeRepository, EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/createEmployee")
    public EmployeeModel createEmployee(EmployeeModel employeeModel) {
        return employeeService.createEmployee(employeeModel);
    }

    @GetMapping("/getEmployees")
    public List<EmployeeModel> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/hello")
    public String greetEmployee() {
        return "hello employee";
    }
}
