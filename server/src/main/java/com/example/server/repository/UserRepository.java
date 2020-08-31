package com.example.server.repository;

import com.example.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Yifan Chen
 * @version 1.0.0
 * @since 8/31/2020 3:34 PM
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
