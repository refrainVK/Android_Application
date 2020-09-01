package com.example.server.service.impl;

import com.example.server.dto.UserDTO;
import com.example.server.entity.User;
import com.example.server.repository.UserRepository;
import com.example.server.service.UserService;
import com.example.server.util.UserDTO2User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yifan Chen
 * @version 1.0.0
 * @since 8/31/2020 3:38 PM
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public User create(UserDTO userDTO) {
        User user = UserDTO2User.convert(userDTO);

        User saved = repository.save(user);

        return saved;
    }
}
