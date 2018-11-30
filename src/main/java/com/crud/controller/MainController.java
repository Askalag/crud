package com.crud.controller;

import com.crud.model.User;
import com.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    private UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/userList")
    public List<User> getUsers() {
        return userService.getAllUser();
    }
    @GetMapping("/userList/byAge/{age}")
    public List<User> getUsersByAge(@PathVariable int age) {
        return userService.getUserListByAge(age);

    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserbyId(id);
    }

    @PostMapping("/user")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

}
