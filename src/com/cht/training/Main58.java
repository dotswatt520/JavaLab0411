package com.cht.training;

import java.util.HashMap;
import java.util.Map;

public class Main58 {
    public static void main(String[] args) {
        Map<String,String> phonebook = new HashMap<>();
        phonebook.put("Mark","111-111");
        phonebook.put("Ken","222-222");
        phonebook.put("Tim","333-333");
        for(String key: phonebook.keySet()){
            System.out.printf("key=%s,values=%s\n",key,phonebook.get(key    ));
        }
    }
}
