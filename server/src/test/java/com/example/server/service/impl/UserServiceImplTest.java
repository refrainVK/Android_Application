package com.example.server.service.impl;

import com.example.server.dto.UserDTO;
import com.example.server.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Yifan Chen
 * @version 1.0.0
 * @since 8/31/2020 8:37 PM
 */
@SpringBootTest
@Slf4j
class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    void create() {
        UserDTO userDTO = new UserDTO();
        userDTO.setPassword("123456");
        userDTO.setUsername("testfromUserServiceImpl");
        User user = userService.create(userDTO);
        log.info("[create user] {}", user);
        assertNotNull(user);
    }
}