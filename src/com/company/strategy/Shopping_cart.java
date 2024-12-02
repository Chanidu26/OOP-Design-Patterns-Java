package com.company.strategy;

public class Shopping_cart {

    private PaymentStragedy paymentStragedy;

    public void set_payment_stragedy(PaymentStragedy paymentStragedy){

        this.paymentStragedy = paymentStragedy;
    }
    public void pay(int amount){
        paymentStragedy.pay(amount);
    }
}
