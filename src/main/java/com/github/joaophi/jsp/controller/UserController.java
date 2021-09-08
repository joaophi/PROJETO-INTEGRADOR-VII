package com.github.joaophi.jsp.controller;

import com.github.joaophi.jsp.dao.UserRepository;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
