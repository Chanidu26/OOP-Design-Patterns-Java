package com.company.command;

public class Main {

    public static void main(String[] args) {

        Light light= new Light();
        Command lightoncommand = new LightoffCommand(light);
        lightoncommand.execute();
        Command lightoffcommand = new LightonCommand(light);
        lightoffcommand.execute();

    }
}
