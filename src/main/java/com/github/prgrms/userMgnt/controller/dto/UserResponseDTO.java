package com.github.prgrms.userMgnt.controller.dto;

import com.github.prgrms.userMgnt.model.Email;
import com.github.prgrms.userMgnt.model.User;

import java.time.LocalDateTime;

public class UserResponseDTO {
    private final Long seq;
    private final String email;
    private final int login_count;
    private final LocalDateTime lastLoginAt;

    public static UserResponseDTO from(User user) {
        return new UserResponseDTO(
                user.getSeq(),
                user.getEmail().getEmailAddr(),
                user.getLogin_count(),
                user.getLast_login_at()
        );
    }

    public  UserResponseDTO(Long seq, String email, int login_count, LocalDateTime lastLoginAt) {
        this.seq = seq;
        this.email = email;
        this.login_count = login_count;
        this.lastLoginAt = lastLoginAt;
    }

    public Long getSeq() {
        return seq;
    }

    public String getEmail() {
        return email;
    }

    public int getLogin_count() {
        return login_count;
    }

    public LocalDateTime getLastLoginAt() {
        return lastLoginAt;
    }
}
