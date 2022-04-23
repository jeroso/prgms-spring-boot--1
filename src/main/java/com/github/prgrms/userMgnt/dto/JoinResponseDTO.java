package com.github.prgrms.userMgnt.dto;

public class JoinResponseDTO {
    private String success;
    private String response;

    public JoinResponseDTO(String success, String response) {
        this.success = success;
        this.response = response;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
