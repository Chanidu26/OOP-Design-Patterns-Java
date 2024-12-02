package com.company.templatemethod;

public class Teamaker extends BeverageMaker {

    @Override
    void brew() {
         System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }


}
