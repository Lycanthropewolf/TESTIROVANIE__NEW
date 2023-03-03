package com.example.testirovanie;

public class User {
    private static String login;
    public static String email;

    public User(String login, String email) {
        if (login.length() != email.length() || login != null || !login.isEmpty() || !login.isBlank()) {
            this.login = login;
        } else {
            throw new RuntimeException("incorrect Login");
        }
        if (email.contains("@") || email.contains(".") || email != null || !email.isEmpty() || !email.isBlank()) {
            this.email = email;
        } else {
            throw new RuntimeException("incorrect email");
        }
    }


    public User() {
    }

    public static String getLogin() {
        return login;
    }

    public static String getEmail() {
        return email;
    }

}
