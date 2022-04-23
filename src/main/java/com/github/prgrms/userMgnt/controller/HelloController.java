package com.github.prgrms.userMgnt.controller;

import com.github.prgrms.userMgnt.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/users")
    public List<User> getUsers(){
        return null;
    }
}
