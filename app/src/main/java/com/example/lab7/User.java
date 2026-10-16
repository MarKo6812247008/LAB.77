package com.example.lab7;

public class User {
    public Integer userId;
    public String username;
    public Integer password;
    public String email;

    public void login() {
        System.out.println("Login");
    }

    public void logout() {
        System.out.println("Logout");
    }

    public void createNote() {
        System.out.println("Create Note");
    }

    public void deleteNote() {
        System.out.println("Delete Note");
    }
}
