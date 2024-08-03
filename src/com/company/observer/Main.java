package com.company.observer;

import java.net.NoRouteToHostException;

public class Main {
    public static void main(String [] args){
        Temprature temprature = new Temprature();

        Observer notification = new Notification();
        Observer airConditioner = new AirConditioner();
        Observer display = new Display();

        temprature.addObserver(notification);
        temprature.addObserver(airConditioner);
        temprature.addObserver(display);
        temprature.setvalue(30);

        temprature.removeObserver(airConditioner);
        temprature.setvalue(40);

        temprature.removeObserver(notification);
        temprature.setvalue(50);

    }
}
