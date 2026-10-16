package com.example.lab7;

public class TextNote extends Note {
    private String content;

    public TextNote(String title, String createdDate, String content) {
        super(title, createdDate);
        this.content = content;
    }

    public TextNote() {
        super();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void getSummary() {
        System.out.println(getsummary());
    }

    @Override
    public String getsummary() {
        String userInfo = (getUser() != null) ? "\nUser: " + getUser().username : "";
        return "TextNote:" + "\n" + getTitle() + "\n" + getCreatedDate() + "\nContent: " + content + userInfo;
    }
}
