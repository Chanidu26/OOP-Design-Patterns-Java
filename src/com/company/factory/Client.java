package com.company.factory;

public class Client {
    public static void main(String[] args) {

        Notification notification = NotificationFactory.createNotification("SMS");
        notification.notify("hello");
        notification = NotificationFactory.createNotification("Email");
        notification.notify("Hi Hi");

    }
}
