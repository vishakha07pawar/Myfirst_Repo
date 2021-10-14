package com.vp.corejava;

public class OverRidding {
    public static void main(String[]args){
        PersonClass p =new PersonClass();
        p.display();
        PersonClass s =new Student();
        s.display();
        PersonClass e =new Employee();
        e.display();
    }

}
class PersonClass{
    public void display(){
        System.out.println("Person class");
    }
}
class Student extends PersonClass{
    public void display(){
        System.out.println("I am a student");
    }

}
class Employee extends Student{
    public void display(){
        System.out.println("I am a employee");
    }
}
