package com.example.lab7;

public class LAB4 extends Note {
    private String content;

    public LAB4(String title, String createdDate, String content) {
        super(title, createdDate);
        this.content = content;
    }

    @Override
    public void getSummary() {
        System.out.println(getsummary());
    }

    @Override
    public String getsummary() {
        return "LAB4 Note: " + content;
    }
}
