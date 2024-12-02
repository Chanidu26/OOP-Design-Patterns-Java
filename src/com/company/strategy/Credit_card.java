package com.company.strategy;

public class Credit_card implements PaymentStragedy {

    private String cardnumber;

    public Credit_card(String cardnumber){
        this.cardnumber = cardnumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount+"is credited to "+cardnumber);
    }
}
