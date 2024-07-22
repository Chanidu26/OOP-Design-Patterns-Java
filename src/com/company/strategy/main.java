package com.company.strategy;

public class main {
  public static void main(String [] args){

     ShoppingCart cart = new ShoppingCart(new CreditCard(123456789,"Chanidu"));
     cart.paymentexecute(5000);

     cart = new ShoppingCart(new CryptoPay("urt6474882"));
     cart.paymentexecute(6000);

     cart = new ShoppingCart(new PayPal("Chanidu@gmail.com"));
     cart.paymentexecute(200);

  }
}
