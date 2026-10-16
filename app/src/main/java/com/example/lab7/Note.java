package com.example.lab7;

public abstract class Note {
    private String title;
    String createdDate;
    private User user;

    // Constructor
    public Note(String title, String createdDate) {
        this.title = title;
        this.createdDate = createdDate;
    }

    public Note() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public abstract void getSummary();
    public abstract String getsummary();
}
