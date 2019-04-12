package com.cht.training.Lab12;

public class Employee {
    final int gradeLevel; //但final一定要初始化

    public Employee() {
        //gradeLevel = 0; //不初始化,不是好寫法
        gradeLevel = 0;
    }

    public Employee(int grade) {
        gradeLevel = grade;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void onBoard() {
        System.out.println("Hi I am a newbee");
    }
}
