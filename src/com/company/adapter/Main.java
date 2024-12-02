package com.company.adapter;

public class Main {
    public static void main(String[] args){
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer adapter = new Adapter(legacyPrinter);
        print(adapter);
    }
    public static void print(Printer printer){
        printer.print();
    }
}
