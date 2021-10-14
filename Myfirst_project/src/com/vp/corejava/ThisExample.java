package com.vp.corejava;
//this keyword mainly used to differentiate instance variable with the local variable
// if they have same names within a constructor or method
public class ThisExample {
    //instance variable
    int num = 10;

    ThisExample() {
        System.out.println("this keyword Example");
    }

    ThisExample(int num) {
        this();//invoking a default constructor
        this.num = num;//here we're assigning the local variable num to instance variable num.

    }

    public void greet(){
        System.out.println("Hi welcome");

    }
    public void print(){
        //local variable num
        int num=20;
        System.out.println("printing the local variable num: "+num);
        System.out.println("printing the instance variable num: "+this.num);
        //invoking greet method
        this.greet();
    }
    public static void main(String[]args){
        ThisExample obje1 =new ThisExample();
        obje1.print();
        ThisExample obje2 =new ThisExample(40);
        obje2.print();
    }
}