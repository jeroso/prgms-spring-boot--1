package com.github.prgrms.userMgnt.dto;

public class JoinRequestDTO {
    private String principal;
    private String credencials;

    public JoinRequestDTO(String principal, String credencials) {
        this.principal = principal;
        this.credencials = credencials;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getCredencials() {
        return credencials;
    }

    public void setCredencials(String credencials) {
        this.credencials = credencials;
    }
}
