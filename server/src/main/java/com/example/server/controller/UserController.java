package com.example.server.controller;

import com.example.server.VO.ResultVO;
import com.example.server.dto.UserDTO;
import com.example.server.entity.User;
import com.example.server.enums.ResultEnum;
import com.example.server.service.UserService;
import com.example.server.util.ResultVOUtil;
import com.example.server.util.UserDTO2User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/register")
    public ResultVO register(UserDTO userDTO) {
        ResultVO result;
        try {
            userService.create(userDTO);
            result = ResultVOUtil.success();
        } catch (Exception e) {
            result = ResultVOUtil.error(ResultEnum.ERROR.getCode(), e.getMessage());
        }
        return result;
    }
}
