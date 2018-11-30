package com.crud.service;

import com.crud.model.User;

import java.util.List;

public interface UserService {

    public User getUserbyId(String id);
    public List<User> getUserListByAge(int age);
    public List<User> getAllUser();

    public void saveUser(User user);
    public void updateUser(User user);
}
