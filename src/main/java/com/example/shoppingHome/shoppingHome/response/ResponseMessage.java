package com.example.shoppingHome.shoppingHome.response;

import lombok.Data;


public class ResponseMessage {

    private String message;
    private Integer response;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getResponse() {
        return response;
    }

    public void setResponse(Integer response) {
        this.response = response;
    }
}
