package com.cht.training;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main55 {
    public static void main(String[] args) {
        String string1 = "abcde12345";  //字串串接使用Stringbuilder
        StringBuilder builder = new StringBuilder();
        List<Character> List1 = new LinkedList<>();
        for (char stringChar: string1.toCharArray()){
            List1.add(stringChar); //把abcde12345放到LinkedList
        }

        ListIterator<Character> reverseIterator = List1.listIterator(List1.size());
        while(reverseIterator.hasPrevious()){
            char c = reverseIterator.previous();
            builder.append(c);
        }
        System.out.println("reverse string="+builder.toString());
    }
}
