package com.cht.training.Lab8;

public class Employee implements Working{
    @Override
    public void strartWork() {

    }

    @Override
    public void endWork() {

    }

    public int a;
    protected int b;
    int c;
    private int d;
    public void doSomething() {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
    }

}
