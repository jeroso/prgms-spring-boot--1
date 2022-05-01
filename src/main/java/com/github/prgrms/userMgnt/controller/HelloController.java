package com.github.prgrms.userMgnt.controller;

import com.github.prgrms.userMgnt.controller.dto.ApiResult;
import com.github.prgrms.userMgnt.controller.dto.UserResponseDTO;
import com.github.prgrms.userMgnt.model.User;
import com.github.prgrms.userMgnt.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final UserService userService;
    private final MessageSource messageSource;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public HelloController(UserService userService, MessageSource messageSource) {
        this.userService = userService;
        this.messageSource = messageSource;
    }

    @GetMapping("/users")
    public ResponseEntity getUsers(){
        try {
            List<UserResponseDTO> users = userService.findAll().stream()
                    .map(UserResponseDTO::from)
                    .collect(Collectors.toList());
            return ResponseEntity.ok(ApiResult.success(users));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
