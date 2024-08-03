package com.company.observer;

import javax.print.attribute.standard.JobStateReason;
import java.util.ArrayList;
import java.util.List;

public class Temprature implements Observable {

    private int value;
    private final List <Observer> observers;

    Temprature(){
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.notifyme(this);
        }

    }
    public int getvalue(){
        return value;
    }
    public void setvalue(int value){
        this.value = value;
        notifyObservers();
    }
}
