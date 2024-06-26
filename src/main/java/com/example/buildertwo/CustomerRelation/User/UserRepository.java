package com.example.buildertwo.CustomerRelation.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {


    Optional<UserModel> findById(String userId);
    List<UserModel> findAll();

}
