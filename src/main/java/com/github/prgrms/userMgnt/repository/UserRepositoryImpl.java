package com.github.prgrms.userMgnt.repository;

import com.github.prgrms.userMgnt.model.Email;
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
        return jdbcTemplate.query("SELECT * FROM users", mapper);
    }

    private final static RowMapper<User> mapper = (rs, i) -> User.builder()
            .seq(rs.getLong("SEQ"))
            .email(new Email(rs.getString("EMAIL")))
            .passwd(rs.getString("PASSWD"))
            .login_count(rs.getInt("LOGIN_COUNT"))
            .last_login_at(rs.getTimestamp("LAST_LOGIN_AT").toLocalDateTime())
            .create_at(rs.getTimestamp("CREATE_AT").toLocalDateTime())
            .build();
}
