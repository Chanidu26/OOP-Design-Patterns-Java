package com.company.strategy;

public class CryptoPay implements PaymentStrategy {

    private String walletaddress;

    public CryptoPay(String walletaddress){
        this.walletaddress = walletaddress;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount+" Payment is done by Cryptopay");
    }
}
