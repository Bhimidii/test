Constructor:
1.object creation


explicit:--> developer will do
implicit: -->by default technology is doing
Rules:
Constructor name must be the same as its class name
A Constructor must have no explicit return type
A Java constructor cannot be abstract, static, final, and synchronized

Type:
1.Default
2.Paramteric


Demo(){
}

Demo(int age){
}

Difference Between constructor and method


copy constructor:
There are many ways to copy the values of one object into another in Java. They are:

By constructor
By assigning the values of one object into another
By clone() method of Object class

////

class Test2 implements Cloneable
{
    int a;
    int b;
    Test c = new Test();
    public Object clone() throws
                   CloneNotSupportedException
    {
        return super.clone();
    }
}





=================================================
static:
>> static keyword with variables/class variable, class/class methods, blocks and nested classes.

class Employee{
    int empId;
    String name;
    static String companyName;


   public static String getCompanyName(){
    return companyName;
    }
}

 variables/class variable:
 class/class methods:
  -->A static method belongs to the class rather than the object of a class.
  -->A static method can be invoked without the need for creating an instance of a class.
  -->A static method can access static data member and can change the value of it.


 Restrictions for the static method
 There are two main restrictions for the static method. They are:
   >>  The static method can not use non static data member or call non-static method directly.
   >>  this and super cannot be used in static context.


Static block:
Is used to initialize the static data member.
It is executed before the main method at the time of classloading.
static {

}