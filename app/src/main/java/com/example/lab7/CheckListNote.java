package com.example.lab7;

public class CheckListNote extends Note {
    private String item;

    public CheckListNote(String title, String createdDate, String item) {
        super(title, createdDate);
        this.item = item;
    }

    public CheckListNote() {
        super();
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public void getSummary() {
        System.out.println(getsummary());
    }

    @Override
    public String getsummary() {
        String userInfo = (getUser() != null) ? "\nUser: " + getUser().username : "";
        return "CheckListNote:" + "\n" + getTitle() + "\n" + getCreatedDate() + "\nItems: " + item + userInfo;
    }
}
