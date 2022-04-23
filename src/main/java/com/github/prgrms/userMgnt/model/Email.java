package com.github.prgrms.userMgnt.model;

import java.util.regex.Pattern;

public class Email {
    private String emailAddr;

    public Email(String emailAddr) throws IllegalStateException{
        if(checkLength(emailAddr) && checkPattern(emailAddr))
            this.emailAddr = emailAddr;
        else
            throw new IllegalStateException("wrong Email");
    }

    private boolean checkLength(String emailAddr) {
        return 5 < emailAddr.length() && emailAddr.length() <= 50;
    }
    //자바 정규 표현식
    private boolean checkPattern(String emailAddr) {
        String regex = "^[A-Za-z0-9_\\.\\-]+@[A-Za-z0-9\\-]+\\.[A-Za-z0-9\\-]+";
        return Pattern.matches(regex, emailAddr);
    }
}
