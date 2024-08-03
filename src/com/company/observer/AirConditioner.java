package com.company.observer;

public class AirConditioner implements Observer{
    @Override
    public void notifyme(Observable observable) {
        Temprature temprature = (Temprature)observable;
        System.out.println("Temprature changed in AC");
    }
}
