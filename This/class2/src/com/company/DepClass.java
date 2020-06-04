package com.company;

public class DepClass {
    public static void main(String [] args){
        Department d1= new Department("Ram", 25);
        Department d2 = new Department("anil",125);
        Department d =new Department("hyderabad");
        Department d3 = new Department("delhi",025,"Chris");
        System.out.println(d3.depId);
        System.out.println(d3.deptLoc);
        System.out.println(d3.name);
        Department d5 =  d1;
        System.out.println("D1 is: "+d1+d);
        System.out.println("D5 is: "+d5.name+d2.depId);
    }
}
