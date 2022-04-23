package com.github.prgrms.userMgnt.repository;

import com.github.prgrms.userMgnt.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    @Override
    public User findById(Long userId) {
        jdbcTemplate.queryForObject("SELECT * FROM users WHERE seq = ?", new Object[]{userId}, mapper);
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

//    static RowMapper<User> mapper = (rs, i) -> new User.Builder()
//            .seq(rs.getLong("seq"));

}
