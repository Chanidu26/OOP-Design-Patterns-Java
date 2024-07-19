package com.company.builder;

public class Main {

    public static void main(String[] args){
       //we dont need to give every attributes of the employee to create employee
       Employee em1 = new Employeebuilder().getname("Chanidu").getage(54).gettelephone("091-2296271").getEmployee();
       System.out.println(em1.getdetails());

       Employee em2 = new Employeebuilder().getname("Pasindu").getaddress("123 colombo").getEmployee();
       System.out.println(em2.getdetails());

       Employee em3 = new Employeebuilder().getage(45).getname("Thisal").getEmployee();
       System.out.println(em3.getdetails());
    }

}
