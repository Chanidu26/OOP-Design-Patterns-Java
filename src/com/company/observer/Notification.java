package com.company.observer;

public class Notification implements Observer{
    @Override
    public void notifyme(Observable observable) {
        Temprature temprature = (Temprature)observable;
        System.out.println("Notification: "+temprature.getvalue());
    }
}