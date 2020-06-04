package com.company;

public class Employee {

    int empId;
    String name;
    static String companyName = "IBM";

    Employee(int id, String name){
        this.empId = id;
        this.name = name;
    }

    private void deom(){
        System.out.println("DEMO");

    }

    public static String getCompanyName(){
//        deom();
//        System.out.println(name);

        return companyName;
    }


}
