package com.github.prgrms.userMgnt.repository;

import com.github.prgrms.userMgnt.model.User;

import java.util.List;

public interface UserRepository {

    public User findById(Long id);

    public void add(User user);

    public List<User> findAll();
}
