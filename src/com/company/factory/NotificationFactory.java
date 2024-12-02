package com.company.factory;

public class NotificationFactory{

    public static Notification createNotification(String type){
        if(type.equalsIgnoreCase("SMS")){
            return new SMS();
        }
        else if(type.equalsIgnoreCase("EMAIL")) {
            return new Email();
        }
        else{
            return null;
        }
    }
}
