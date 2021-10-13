package com.vp.corejava;

public class Demo {

    public static void main(String[] args){
        System.out.println("Hello World") ;
        int a = 6,b = 2 ,c=30;//these are local variable because it declared inside the main method
        //instance variables are declared inside the class and outside the method so that multiple method
        // can use these variables'
        //operation arithmetic relation operator
        System.out.println("sum ="+ (a+b) ) ;
        System.out.println("subtraction =" + (a-b) );
        System.out.println("multiplication =" + (a * b)) ;
        System.out.println("division =" + (a / b)) ;
        System.out.println("post increment =" + (a++) ) ;//old value=6 new value=7
        System.out.println("post decrement  =" + (a--) ) ;
        System.out.println("post increment =" + (a++)) ;
        System.out.println("pre increment =" + (++a)) ;
        System.out.println("a >= b =" + (a >= b ));//old value=6 new value=7
        System.out.println("a <= b   =" + (a <= b ) ) ;
        System.out.println("a != b  =" + (a != b )) ;
        System.out.println("a == b  =" + (a == b )) ;
        //System.out.println(" result =" +(result)) ;
        //if else statement
      // if(c==10) {
            //System.out.println("Hello");

        //}else if(c==20){
               // System.out.println("Ok") ;
           // }else if(c==30){
           // System.out.println("great") ;
       // }

       // else{
        //    System.out.println("oops") ;
        //}Switch statement;
        char grade = 'B';
        switch(grade){
            case 'A':
                System.out.println("Excellence");
                break;
            case 'B':
                System.out.println("Good");
                break;
            default:
                System.out.println("Invalid grade");

        }

    }





    }

