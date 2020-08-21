package com.example.shoppingHome.shoppingHome.requests.user;

import lombok.Data;


public class UserEmail {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEmail{" +
                "email='" + email + '\'' +
                '}';
    }
}
