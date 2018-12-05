package com.test.crud.repository;

import com.test.crud.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String>, UserRepositoryCustom{

    User findFirstById(String id);
    List<User> findAll();


}