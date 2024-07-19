package com.company.builder;

public class Employee {
      private String name ;
      private int age;
      private String address;
      private String telephone;

      public Employee(String name, int age,String address , String telephone ){
          super();
          this.name = name;
          this.age = age;
          this.address = address;
          this.telephone = telephone;
      }
      public String getdetails(){
          return "name: "+name+", age: "+age+", address: "+address+", telephone: "+telephone;
      }

}
