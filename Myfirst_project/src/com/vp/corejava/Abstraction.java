package com.vp.corejava;
//In abstraction user will have only information that what the object does instead of how it does.
//it is a process of hiding the implementation details from user.
//abstraction is only achieve using abstraction class and interface.
//for an example  addition class we can declare method variable,
// but we cannot add these variables nor ,we can perform arithmetic operation.
//abstract class can include abstract or non-abstract method.
//if class contain at least one abstract method then the class must be declared as abstract class.
//we cannot make object (instantiate) for abstract class.like we do for exp we have class Demo .
//so we want to invoke Demo class in another class then we make Demo D =new Demo();so this case is not
// happening in abstract class.
public abstract class Abstraction {
    String eName;
    String eAddress;
    int eId;
    Abstraction(String eName,String eAddress,int eId){
        this.eName=eName;
        this.eAddress=eAddress;
       this.eId= eId;
    }
    public void department(){
        System.out.println("Employee working for CSE department");
    }
    public abstract void jobRole();//abstract methods end with semicolon.


}

