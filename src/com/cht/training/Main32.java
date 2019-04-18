package com.cht.training;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main32 {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> words = new TreeSet<>();
        //
        try(Scanner tokerScanner = new Scanner(new FileReader("0411.txt"))){

            tokerScanner.useDelimiter("\\W");
            while(tokerScanner.hasNext()){
                String word = tokerScanner.next();
                words.add(word);
            }

        }


        //tokerScanner.close();

        for (String word:words){
            System.out.println(word+ " ");
        }
        System.out.println();
    }
}
