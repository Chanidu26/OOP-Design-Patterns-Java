package com.company.templatemethod;

public class Cofeemaker extends BeverageMaker {


    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");

    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
