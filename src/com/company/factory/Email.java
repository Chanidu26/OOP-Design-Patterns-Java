package com.company.factory;

public class Email implements Notification {
    @Override
    public void notify(String message) {
        System.out.println("Send an email "+message);
    }
}
