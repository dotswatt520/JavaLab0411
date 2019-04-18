package com.cht.training;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main29 {
    public static void main(String[] args) throws IOException {
        //FileReader reader = new FileReader(("data\\README_TXT"));
        FileReader reader = new FileReader(("C:\\Users\\chtti\\IdeaProjects\\JavaLab0411\\data\\README_TXT"));
        int ch;
        while((ch = reader.read()) !=-1){
            System.out.print((char) ch);
            System.out.printf("%c",ch);
            //System.out.print(" ");
        }
        reader.close();
    }
}

//bye