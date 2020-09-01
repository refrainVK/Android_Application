package com.example.server.util;

import com.example.server.dto.UserDTO;
import com.example.server.entity.User;
import org.springframework.beans.BeanUtils;

/**
 * @author Yifan Chen
 * @version 1.0.0
 * @since 8/31/2020 8:05 PM
 */
public class UserDTO2User {

    public static User convert(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        return user;
    }
}
