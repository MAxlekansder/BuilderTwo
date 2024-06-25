package com.example.buildertwo.EmployeeManagement;

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
}
