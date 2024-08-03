package com.company.observer;

public class Display implements Observer{
    @Override
    public void notifyme(Observable observable) {

        Temprature temprature = (Temprature)observable;
        System.out.println("Temprature is now at "+temprature.getvalue());

    }
}
