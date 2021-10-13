package com.vp.corejava;

public class Modifier {
     //access control modifier are set levels to access classes ,variables ,methods to make them either private
    // protected public or no modifier
   // in private we cannot use or access class constructor method
    // outside class. if we want to access private variables then we need to create public get method .
   public static final String color ="white";
   int mileage =40;
   protected void display(){
       System.out.println("color=" + color );
       System.out.println("Mileage=" + mileage);
   }
   public void ownerDetail(){
       System.out.print("this car is owned by=  ");
   }
  // public class Human extends Modifier{
    //   public static void main(String[]args){
        //   String name="Vishakha";
         //  Human h1 = new Human();
         //  h1.ownerDetail();


       //}


   //}
   public static void main(String[]args){
       Modifier car =new Modifier();
       car.display();
   }
}
