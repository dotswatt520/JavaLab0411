package com.cht.training;

public class Main18 {
    private static String key = "day";
    private static String weekDays = "Sunday Monday Tuesday Wednesday Thursday Friday Saturday";

    public static void main(String[] args) {
        System.out.println("find 'day':"+weekDays.indexOf(key));
        System.out.println("last idex if :"+weekDays.lastIndexOf(key));
        System.out.println("total length:"+weekDays.length());
    }
}
