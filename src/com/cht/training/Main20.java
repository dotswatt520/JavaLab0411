package com.cht.training;

public class Main20 {
    public static void main(String[] args) {
        boolean x1 = false;
        int x2 = 500;
        float x3 = 2.3f;
        double x4 = 3.456789012345;
        String s1 = String.valueOf(x1);
        String s2 = String.valueOf(x2);
        String s3 = String.valueOf(x3);
        String s4 = String.valueOf(x4);

        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println("s3:" + s3);
        System.out.println("s4:" + s4);

        System.out.printf("s1:%s\n",s1);
        System.out.printf("x1:%b\n",x1);
        System.out.printf("x2:%d\n",x2);
        System.out.printf("x3:%.1f\n",x3);
        System.out.printf("x4:%.12f\n",x4);
    }
}

