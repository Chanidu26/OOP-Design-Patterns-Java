package com.company.proxy;

public class Client {

    public static void main(String[] args) {
        Image image = new ProxyImage("kfkfkf.jpg");
        image.display();
        image.display();
    }
}
