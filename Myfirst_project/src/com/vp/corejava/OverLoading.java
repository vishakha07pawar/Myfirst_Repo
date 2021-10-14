package com.vp.corejava;

public class OverLoading {
    //polymorphism has a basically two types one is compiled time
    // and the other is run time compile time is nothing but method
    // overloading.Method Overloading is a feature that allows class to declare 2 or
    // more method using same name but with different parameters.
    int c;
    public void addition(){
        int a=10;
        int b=20;
        System.out.println("sum of a,b=" + (a+b));
    }
    public void addition(int a,int b){
        System.out.println(a+b);
    }
    public void addition(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[]args){
        OverLoading obj1 =new OverLoading();
        obj1.addition();
        obj1.addition(20,30);
        obj1.addition(10,40,30);
    }
}
