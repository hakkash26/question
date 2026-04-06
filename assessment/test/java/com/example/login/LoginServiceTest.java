package com.example.login;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginServiceTest {

    LoginService service = new LoginService();

    @Test
    void testValidLogin() {
        assertTrue(service.login("admin", "1234"));
    }

    @Test
    void testInvalidUsername() {
        assertFalse(service.login("wrong", "1234"));
    }

    @Test
    void testInvalidPassword() {
        assertFalse(service.login("admin", "wrong"));
    }

    @Test
    void testBothWrong() {
        assertFalse(service.login("user", "pass"));
    }
}