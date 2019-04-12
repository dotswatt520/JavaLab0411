package com.cht.training;

public class Employee {
    static {
        System.out.println("***run something...");
        counter=500;
    }

    private String name;
    private static int counter; //static的重要,已可使用,但宣告在下面.jave bytecode

    public int getCounter2() {
        return counter;
    }

    public static int getCounter() {
        return counter;
    }


    public Employee() {
    } //空的建構子


    public Employee(String name) {
        this.name = name;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Kevin");
        System.out.println("keven name=" + emp1.getName());
        emp1.setName("Kevin Wang");
        System.out.println("keven name=" + emp1.getName());
    }
}

