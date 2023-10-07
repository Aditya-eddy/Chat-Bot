package com.example.chatbot;

public class Message {
    public static String SENT_BY_ME = "me";
    public static String SENT_BY_BOT = "bot";

    String message;
    String SendBy;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSendBy() {
        return SendBy;
    }

    public void setSendBy(String sendBy) {
        SendBy = sendBy;
    }

    public Message(String message, String sendBy) {
        this.message = message;
        SendBy = sendBy;
    }
}
