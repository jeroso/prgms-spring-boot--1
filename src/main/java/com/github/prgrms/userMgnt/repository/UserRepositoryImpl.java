package com.github.prgrms.userMgnt.repository;

import com.github.prgrms.userMgnt.model.User;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
