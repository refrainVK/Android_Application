package com.example.server.repository;

import com.example.server.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Yifan Chen
 * @version 1.0.0
 * @since 8/31/2020 3:55 PM
 */
@SpringBootTest
@Slf4j
class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    void findByUsername() {
        User found = repository.findByUsername("test");
        log.info("[found user] {}", found);
        assertNotNull(found);
    }
}