package com.example.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yifan Chen
 * @version 1.0.0
 * @since 9/1/2020 12:51 PM
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to CS8803 first assignment server!";
    }
}
