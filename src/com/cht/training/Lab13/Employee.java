package com.cht.training.Lab13;

public class Employee {
    private static int counter;

    public Employee() {
        counter ++;
    }

    public int getcount(){
        return counter;
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            Employee e1=new Employee();
            System.out.println(e1.getcount());
        }
    }
}
