package com.angularSpring.crud.service;

import com.angularSpring.crud.model.User;

import java.util.List;

public interface UserService {

    User getUserById(String id);
    List<User> getAllUser();

    void saveUser(User user);
    void updateUser(User user);
    void removeUser(User user);

    void dropCol();
}
