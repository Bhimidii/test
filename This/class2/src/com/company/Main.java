package com.company;

public class Main {

    static String projectTitle;

    static{
        projectTitle = "DEMO Project";
    };




//    String p ="Main method";

    public static void main(String[] args) {
        System.out.println(projectTitle);
	// write your code here
//        Person p = new Person();
//        Person p1 = new Person("Sripal", 30);/// actual copy
//        Person p2 = new Person(p1);
//
//        Person p4 = p2;

        Employee e1 = new Employee(100, "XYZ");
        Employee.companyName = "HCL";
        String s = Employee.getCompanyName();
        System.out.println(s);
        System.out.println(e1.empId);
        System.out.println(e1.name);

    }
}
