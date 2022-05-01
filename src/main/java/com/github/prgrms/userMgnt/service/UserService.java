package com.github.prgrms.userMgnt.service;

import com.github.prgrms.userMgnt.model.User;
import com.github.prgrms.userMgnt.repository.UserRepository;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Locale;

@Service
@Transactional(readOnly = true)
public class UserService {

    private final MessageSource messageSource;
    private final UserRepository userRepository;

    public UserService(MessageSource messageSource, UserRepository userRepository) {
        this.messageSource = messageSource;
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> {
            throw new IllegalArgumentException(messageSource.getMessage("user.notFound", null, Locale.getDefault()));
        });
    }
}
