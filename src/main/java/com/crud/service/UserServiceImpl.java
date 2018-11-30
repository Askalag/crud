package com.crud.service;

import com.crud.model.User;
import com.crud.repository.UserRepositoryCustom;
import com.crud.repository.UserRepository;
import com.mongodb.MongoWriteException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findFirstById(id);
    }

    @Override
    public User getUserByNickName(String name) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        try{
            userRepository.insert(user);
        } catch(org.springframework.dao.DuplicateKeyException e){
            //TODO - Do want you want
            System.out.println("Filed");
        }

    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void removeUser(User user) {
        userRepository.delete(user);
    }
}
