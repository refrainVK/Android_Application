package com.example.server.controller;

import com.example.server.entity.User;
import com.example.server.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yifan Chen
 * @version 1.0.0
 * @since 8/31/2020 3:45 PM
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get/{username}")
    public User getUserInfo(@PathVariable("username") String username) {
        return userService.findByUsername(username);
    }
}
