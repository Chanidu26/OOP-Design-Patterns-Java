package com.company.strategy;

public class CreditCard implements PaymentStrategy {

    private int cardnumber;
    private String cardholdername;

    public CreditCard(int cardnumber,String cardholdername){
        this.cardholdername = cardholdername;
        this.cardnumber = cardnumber;
    }
    @Override
    public void pay(int amount) {
       System.out.println(amount+" of payment is done by credit card");
    }
}
