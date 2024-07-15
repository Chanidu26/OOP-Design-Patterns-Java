package com.company.singleton;

public class Single {

    private static Single initialsingle;//variable reference of instance
    private Single(){//constructor is private,so cannot create instances as we want
         System.out.println("hello i'am singleton class");
    };
    public static synchronized Single getinstance(){//static method to get instance
        if(initialsingle == null){
            initialsingle = new Single();
        }
        return initialsingle;
    }

}
