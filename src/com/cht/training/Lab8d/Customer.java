package com.cht.training.Lab8d;

import com.cht.training.Lab8.Employee;

public class Customer {
    public void foo()
    {
        Employee e1=new Employee();
        System.out.println("a=" + e1.a);
        //System.out.println("b=" + e1.b);
        //System.out.println("c=" + e1.c);
        //System.out.println("d=" + e1.d); //d has private access
    }
}
