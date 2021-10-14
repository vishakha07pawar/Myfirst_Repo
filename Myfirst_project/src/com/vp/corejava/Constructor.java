package com.vp.corejava;
//constructor name should be name of class name and constructor
// doesn't have any return type like int void etc.
class constructorDemo{
    int x;
    constructorDemo(){
        x= 20;
    }
}

class parametrized{
    int x;
    //parameterized constructor
    parametrized(int i){
        x=i;
    }
}
public class Constructor {
    public static void main(String []args){
        constructorDemo t1 =new constructorDemo();
        constructorDemo t2 =new constructorDemo();
        System.out.println(t1.x +" "+t2.x );
        parametrized t3 =new parametrized(20);
        parametrized t4 =new parametrized(30);
        System.out.println(t3.x +" "+t4.x );
    }
}
 //Uses of this keyword in constructor for calling the method and intialising the
//variables

