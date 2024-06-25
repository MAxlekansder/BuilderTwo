package com.example.buildertwo.EmployeeManagement;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeModel, String> {

    List<EmployeeModel> findAll();

}
