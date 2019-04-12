package com.cht.training.Lab12;

public class Mian12 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        System.out.println("e1 grade="+ e1.getGradeLevel());
        Employee e2=new Employee(7);
        System.out.println("e2 grade="+ e2.getGradeLevel());
    }
}
