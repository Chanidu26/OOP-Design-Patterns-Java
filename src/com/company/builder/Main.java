package com.company.builder;

public class Main {

    public static void main(String[] args){
       //we dont need to give every attributes of the employee to create employee
       Employee em1 = new Employeebuilder().getname("Chanidu").getage(54).getEmployee();
       System.out.println(em1.getdetails());
    }

}
