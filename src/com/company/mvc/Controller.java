package com.company.mvc;
public class Controller {
    private Model model;
    private View view;
    public Controller(Model model,View view){
        this.model = model;
        this.view = view;
    }
    public void set_id(int id){
        model.setid(id);
    }
    public void set_name(String name){
        model.setname(name);
    }
    public int get_id(int id){
        return model.get_id();
    }
    public String get_name(String name){
        return model.get_name();
    }
    public void display(){
        view.display(model.get_id(), model.get_name());
    }
}