package com.github.prgrms.userMgnt.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
    private final Long seq;
    private final Email email;
    private final String passwd;
    private int login_count;
    private LocalDateTime last_login_at;
    private LocalDateTime create_at;

    public static Builder builder() {
        return new Builder();
    }

    public User(Builder builder) {
        this.seq = builder.seq;
        this.email = builder.email;
        this.passwd = builder.passwd;
        this.login_count = builder.login_count;
        this.last_login_at = builder.last_login_at;
        this.create_at = builder.create_at;
    }

    public Long getSeq() {
        return seq;
    }

    public Email getEmail() {
        return email;
    }

    public String getPasswd() {
        return passwd;
    }

    public int getLogin_count() {
        return login_count;
    }

    public LocalDateTime getLast_login_at() {
        return last_login_at;
    }

    public LocalDateTime getCreate_at() {
        return create_at;
    }

    public static class Builder{
        private Long seq;
        private Email email;
        private String passwd;
        private int login_count;
        private LocalDateTime last_login_at;
        private LocalDateTime create_at;

        public Builder seq(Long seq) {
            this.seq = seq;
            return this;
        }
        public Builder email(Email email) {
            this.email = email;
            return this;
        }
        public Builder passwd(String passwd) {
            this.passwd = passwd;
            return this;
        }
        public Builder login_count(int login_count) {
            this.login_count = login_count;
            return this;
        }
        public Builder last_login_at(LocalDateTime last_login_at) {
            this.last_login_at = last_login_at;
            return this;
        }
        public Builder create_at(LocalDateTime create_at) {
            this.create_at = create_at;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
