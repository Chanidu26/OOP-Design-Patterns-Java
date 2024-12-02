package com.company.mvc;

public class Model {

    private int id;
    private String name;

    public void setid(int id){
        this.id = id;
    }
    public void setname(String name){
        this.name = name;
    }
    public String get_name(){
        return name;
    }
    public int get_id(){
        return id;
    }

}
