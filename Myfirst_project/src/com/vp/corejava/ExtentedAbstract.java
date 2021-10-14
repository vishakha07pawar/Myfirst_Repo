package com.vp.corejava;

public class ExtentedAbstract extends Abstraction{
  ExtentedAbstract(String eName,String eAddress,int eId){
      super(eName,eAddress,eId);

  }
    @Override
    public void jobRole() {
        System.out.println("Teaching");
    }
    public static void main(String[]args){
      ExtentedAbstract e =new ExtentedAbstract("vishakha","Mumbai",13);
      System.out.print(e.eName +" "+e.eAddress+" "+e.eId);
      e.department();
      e.jobRole();


    }
}
