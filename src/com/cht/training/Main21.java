package com.cht.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main21 {
    private static final String S1="Hello world java progrmming";
    private static final String S2="Hello_world_java_progrmming";
    private static final String S3="Hello\\world\\\\java\\\\\\progrmming";
    private static final String S4="Hello/world//java////progrmming";

    public static void main(String[] args) {
            //***一到多個字
        Pattern p1=Pattern.compile("\\w+");
        Matcher matcher1 = p1.matcher(S1);

        while (matcher1.find()){
            System.out.printf("(%s) ",matcher1.group());
        }
        System.out.printf("\n");
            //***一到多個非空白
        Pattern p2=Pattern.compile("[^\\s]]");
        Matcher matcher2 = p1.matcher(S1);

        while (matcher2.find()){
            System.out.printf("(%s) ",matcher2.group());
        }
        System.out.printf("\n");
            //*** 利用split
        for (String segment:S1.split("")){
            System.out.printf("[%s] ",segment);
        }
        System.out.printf("\n");
        //************************************************************************8

            //***非一到多個_
        Pattern p3=Pattern.compile("[^_]]");
        Matcher matcher3 = p1.matcher(S2);

        while (matcher3.find()){
            System.out.printf("(%s) ",matcher3.group());
        }
        System.out.printf("\n");
            //*** 利用split
        for (String segment:S2.split("_")){
            System.out.printf("[%s] ",segment);
        }
        System.out.printf("\n");
        //************************************************************************8
            //***非一到多個\
        Pattern p4=Pattern.compile("[^\\\\]]");
        Matcher matcher4 = p1.matcher(S3);

        while (matcher4.find()){
            System.out.printf("(%s) ",matcher4.group());
        }
        System.out.printf("\n");
            //*** 利用split
        for (String segment:S3.split("\\\\")){
            System.out.printf("[%s] ",segment);
        }
        System.out.printf("\n");
        //************************************************************************8
            //***非一到多個/
        Pattern p5=Pattern.compile("[^/]]");
        Matcher matcher5 = p1.matcher(S4);

        while (matcher5.find()){
            System.out.printf("(%s) ",matcher5.group());
        }
        System.out.printf("\n");
            //*** 利用split
        for (String segment:S4.split("/")){
            System.out.printf("[%s] ",segment);
        }
        System.out.printf("\n");


    }
}
