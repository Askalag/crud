package com.crud.repository;

import com.crud.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String>, UserRepositoryCustom{

    User findFirstById(String id);
    User getByNickName(String name);
    List<User> findAll();


}
