package com.company.strategy;

public class Main {

    public static void main(String[] args) {

        Shopping_cart shopping_cart = new Shopping_cart();
        shopping_cart.set_payment_stragedy(new PayPal("email"));
        shopping_cart.pay(500);
        shopping_cart.set_payment_stragedy(new Credit_card("hdhdhdhdh"));
        shopping_cart.pay(200);
    }
}
