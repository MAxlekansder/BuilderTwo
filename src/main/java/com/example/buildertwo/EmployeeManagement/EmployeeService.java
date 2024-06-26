package com.example.buildertwo.EmployeeManagement;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeModel createEmployee(EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }

    public List<EmployeeModel> getEmployees() {
        return employeeRepository.findAll();
    }



    @PostConstruct
    public void generateEmployee() {
        EmployeeModel employee = new EmployeeModel();

        employee.setName("Admin");


    }
}
