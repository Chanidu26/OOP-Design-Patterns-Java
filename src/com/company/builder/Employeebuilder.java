package com.company.builder;

public class Employeebuilder {
    private String name ;
    private int age;
    private String address;
    private String telephone;

    //create getters and setters
    public Employeebuilder getname(String name){
          this.name = name;
          return this;
    }
    public Employeebuilder getage(int age){
        this.age = age;
        return this;
    }
    public Employeebuilder getaddress(String address){
        this.address = address;
        return this;
    }
    public Employeebuilder gettelephone(String telephone){
        this.telephone = telephone;
        return this;
    }
    public Employee getEmployee(){
        return new Employee(name,age,address,telephone);
    }
}
