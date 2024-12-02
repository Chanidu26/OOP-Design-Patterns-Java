package com.company.strategy;

public class PayPal implements PaymentStragedy {

    private String email;

    public PayPal(String email){
        this.email = email;
    }
    @Override
    public void pay(int amount) {
        System.out.println("paying "+amount+" using PayPal "+email);
    }
}
