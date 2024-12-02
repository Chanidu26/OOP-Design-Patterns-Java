package com.company.proxy;

public class RealImage implements Image{

    private String filename;

    public RealImage(String filename){
        this.filename = filename;
        loading();
    }

    public void loading(){
        System.out.println("Loading "+filename);
    }
    @Override
    public void display() {
        System.out.println("Displaying "+filename);
    }
}
