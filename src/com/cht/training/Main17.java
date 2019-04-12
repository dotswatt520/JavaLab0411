package com.cht.training;

public class Main17 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String ("Hello");
        System.out.printf("s1 == s2 %b\n" , s1 == s2);
        System.out.printf("s1 equal s2%b\n",s1.equals(s2));
    }
}
