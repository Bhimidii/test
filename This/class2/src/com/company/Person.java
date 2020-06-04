package com.company;

public class Person {
   String name;
    int age;


    Person(){
        System.out.println("Default Cons A");
    }

    Person(String name){
        System.out.println("Cons B");
    }

    Person(int age){
        System.out.println("Cons C");
    }

    Person(int age, String name){
        System.out.println("Cons D");
    }

    Person(Person p){
        this.name =  p.name;
        this.age = p.age;
    }

    Person(String name, int age){
        this.name = name;
        this.age=age;
        System.out.println("cons E");
    }

    public void Person(){
        System.out.println("Method");
    }
}
