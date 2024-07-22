package com.company.strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void paymentexecute(int amount){
        paymentStrategy.pay(amount);
    }
}
