package com.company;

public class Department {
     static String name;
    int depId;
    String deptLoc;

    Department (String name, int depId){
        System.out.println("*************");
        System.out.println("Employee name:" + name + " employee Id: " + depId);
    }
    Department (String deptLoc){
        System.out.println("*************");
        System.out.println("Employee location: "+deptLoc);
    }
    Department (String deptLoc, int depId, String name){
        this.name = name;
        this.depId = depId;
        this.deptLoc=deptLoc;
    }

}
