package com.crud.service;

import com.crud.model.User;

import java.util.List;

public interface UserService {

    User getUserById(String id);
    User getUserByNickName(String name);
    List<User> getAllUser();

    void saveUser(User user);
    void updateUser(User user);
    void removeUser(User user);
}
