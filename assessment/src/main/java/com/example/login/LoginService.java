package com.example.login;

public class LoginService {

    private static final String CORRECT_USERNAME = "admin";
    private static final String CORRECT_PASSWORD = "1234";

    public boolean login(String username, String password) {
        return CORRECT_USERNAME.equals(username) &&
               CORRECT_PASSWORD.equals(password);
    }
}