package com.company.adapter;

public class Adapter implements Printer {

    private LegacyPrinter legacyPrinter;

    public Adapter(LegacyPrinter legacyPrinter){
        this.legacyPrinter = legacyPrinter;
    }
    @Override
    public void print() {
        legacyPrinter.printdocument();
    }
}
