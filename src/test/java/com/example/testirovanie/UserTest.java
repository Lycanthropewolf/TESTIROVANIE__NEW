package com.example.testirovanie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class UserTest {


    User user2 = new User();

    @Test
    void createdObject() {
        User user1 = new User("LOGIN", "EMAIL.ru");
        String login = "LOGIN";
        String email = "EMAIL.ru";
        Assertions.assertEquals(login, user1.getLogin());
        Assertions.assertEquals(email, user1.getEmail());
    }

    @Test
    void createdObject2() {
        User user2 = new User();
        User user3 = new User();
        Assertions.assertFalse(user2.equals(user3));
    }

    @Test
    void correctEmail() {
        User user1 = new User("LOGIN", "EMAIL@.ru");
        Assertions.assertTrue(user1.getEmail().contains("@"));
        Assertions.assertTrue(user1.getEmail().contains("."));
    }
    @Test
    void correctLoginAndEmail() {
        User user1 = new User("LOGIN", "EMAIL@.ru");
        Assertions.assertFalse(user1.getLogin().equals(user1.getEmail()));

    }
    @Test
    void getLogin() {
    }

    @Test
    void getEmail() {
    }
}