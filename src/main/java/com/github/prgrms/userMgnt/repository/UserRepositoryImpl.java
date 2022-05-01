package com.github.prgrms.userMgnt.repository;

<<<<<<< HEAD
import com.github.prgrms.userMgnt.common.Utils;
=======
>>>>>>> 1e5a2a0ff2faad01ebe99c1460de3094980ff2af
import com.github.prgrms.userMgnt.model.Email;
import com.github.prgrms.userMgnt.model.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    @Override
    public Optional<User> findById(Long userId) {
        try {
            return Optional.ofNullable(jdbcTemplate.queryForObject(
                    "SELECT SEQ, EMAIL, PASSWD, LOGIN_COUNT, LAST_LOGIN_AT, CREATE_AT FROM USERS WHERE SEQ = ?", mapper, userId
            ));
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
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
<<<<<<< HEAD
            .last_login_at(Utils.convertTime(rs.getTimestamp("LAST_LOGIN_AT")))
            .create_at(Utils.convertTime(rs.getTimestamp("CREATE_AT")))
=======
            .last_login_at(rs.getTimestamp("LAST_LOGIN_AT").toLocalDateTime())
            .create_at(rs.getTimestamp("CREATE_AT").toLocalDateTime())
>>>>>>> 1e5a2a0ff2faad01ebe99c1460de3094980ff2af
            .build();
}
