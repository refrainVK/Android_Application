package com.example.server.service;


import com.example.server.dto.UserDTO;
import com.example.server.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author Yifan Chen
 * @version 1.0.0
 * @since 8/31/2020 3:35 PM
 */
@Service
public interface UserService {

    User findByUsername(String username);

    User create(UserDTO userDTO);
}
