package com.cht.training;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main36 {
    private static  final String FILENAME = "data\\phoneBook";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Map<String,String> phonebook = new HashMap<>();
        phonebook.put("Mark","1234567");
        phonebook.put("John","7654321");
        System.out.printf("phoneBook=%s\n",phonebook);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILENAME))){
            outputStream.writeObject(phonebook);
        }
        System.out.println("read it back...");
        try(ObjectInputStream inputStream = new ObjectInputStream((new FileInputStream(FILENAME)))){
            Object object = inputStream.readObject();
            if (object != null && object instanceof Map){
                Map<String,String> readPoneBook = (Map<String,String>)object;
                for (Map.Entry<String,String> account:readPoneBook.entrySet()){
                    System.out.printf("key=%s,value=%s\n",account.getKey(),account.getValue());
                }
            }
        }
    }


}
