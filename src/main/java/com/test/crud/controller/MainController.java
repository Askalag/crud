package com.test.crud.controller;

import com.test.crud.model.User;
import com.test.crud.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    private UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/userList")
    public List<User> getUsers() {
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @PutMapping("/user")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @DeleteMapping("/user")
    public void removeUser(@RequestBody User user) {
        userService.removeUser(user);
    }

    @DeleteMapping("/user/dropAll7")
    public void removeUserCol() {
        userService.dropCol();
    }

}
