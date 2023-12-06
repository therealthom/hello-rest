package com.nuuptech.hellorest;

public class Message {
    private String text;

    public Message() {
    }

    public Message(String text) {
        this.text = text;
    }

    // Getters y setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
