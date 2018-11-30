package com.crud.repository;

import com.crud.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    User findFirstById(String id);
    List<User> findAllByAge(int age);
    List<User> findAll();


}
