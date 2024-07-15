package com.company.singleton;

public class  Main {

    public static void main(String[] args) {

        Single single1 = Single.getinstance();//this instance is created
        Single single2 = Single.getinstance();//this instance is not created
        Single single3 = Single.getinstance();
    }
}
