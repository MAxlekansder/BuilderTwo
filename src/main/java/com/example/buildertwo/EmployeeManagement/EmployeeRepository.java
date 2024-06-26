package com.example.buildertwo.EmployeeManagement;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeModel, String> {

    List<EmployeeModel> findAll();
    Optional<EmployeeModel> findEmployeeModelByEmployeeId(String id);

}
