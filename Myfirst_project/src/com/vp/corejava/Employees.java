package com.vp.corejava;

public class Employees implements Person {

    @Override
    public void Department() {
        System.out.println("CSE department");
    }

    @Override
    public void JobRole() {
        System.out.println("Teaching");
    }

    public static void main(String[] args) {
        Employees e = new Employees();
        e.Department();
        e.JobRole();
    }
}
