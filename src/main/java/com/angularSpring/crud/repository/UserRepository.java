package com.angularSpring.crud.repository;

import com.angularSpring.crud.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String>, UserRepositoryCustom{

    User findFirstById(String id);
    List<User> findAll();


}
