package com.majorproject.bloodandbuddies.Model;

public class Notification {
    String receiverID, senderID, text, date;

    public Notification() {
    }

    public Notification(String receiverID, String senderID, String text, String date) {
        this.receiverID = receiverID;
        this.senderID = senderID;
        this.text = text;
        this.date = date;
    }

    public String getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(String receiverID) {
        this.receiverID = receiverID;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
