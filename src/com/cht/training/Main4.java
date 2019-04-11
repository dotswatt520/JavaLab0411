package com.cht.training;

public class Main4 {
    public static void main(String[] args) {  //public static不用被生成就可以用 void不用回傳值
        Employee emp1; //null物件,要到被new時才會生成
        Employee emp2;
        Employee emp3;
        Employee emp4;
        emp1 = new Employee("Mark"); //每new一次是allocate一次memory
        emp2 = new Employee("James");
        emp3 = new Employee("Mark");
        emp4 = emp1;
        System.out.println("emp1=" + emp1.getName());
        System.out.println("emp2=" + emp2.getName());
        System.out.println("emp3=" + emp3.getName());
        System.out.println("emp4=" + emp4.getName());
    }
}

