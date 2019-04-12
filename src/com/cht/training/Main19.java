package com.cht.training;

public class Main19 {
    public static void main(String[] args) {
        String prolog = "This article is about the programming language. For the narrative device,see";
        String matching="FIND:This";
        String matching2="FIND:is";
        String matching3="FIND:IS";
        System.out.println("fine This:"+prolog.regionMatches(0,matching,5,3));
        System.out.println("fine is:"+prolog.regionMatches(2,matching2,5,2));
        System.out.println("fine IS(ignore case):"+prolog.regionMatches(true,2,matching3,5,2));
    }
}
