package com.company.command;

public class LightoffCommand implements Command{

    private Light light;

    public LightoffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turn_off();
    }
}
