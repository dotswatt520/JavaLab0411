package com.cht.training.Lab11;

public class Main11 {
    public static void main(String[] args) {
        Engineer engineer1=new Engineer();
        engineer1.working();
        PM pm1 = new PM();
        pm1.working();
        //Employee em1 = new Employee() { //無法實作因為沒有實作abstract
        //    }

        //多形
        Employee emp1 = new Engineer();
        //emp1.debug(); //以employee來看engineer的body內容,但沒法使用engineer.debug
        Employee emp2 = new Engineer();
        Employee emp3 = new PM();

        Employee[] allStaffs = {emp1,emp2,emp3};
        for ( Employee staff : allStaffs){
            staff.working();
        }
    }
}
