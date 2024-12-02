package com.company.factory;

public class SMS implements Notification{
    @Override
    public void notify(String message) {
        System.out.println("You have sms "+message);
    }
}
