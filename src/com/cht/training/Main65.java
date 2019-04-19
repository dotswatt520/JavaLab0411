package com.cht.training;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main65 {
    public static void main(String[] args) {
        List<String> versions = new LinkedList<>();
        versions.add("2.2 fryoyo");
        versions.add("2.3 gingerbread");
        versions.add("4.0 ice cream sandwith");
        versions.add("4.1 jelly bean");
        versions.add("5.1 kitkat");
        versions.add("5.2 lollipop");
        versions.add("5.2 lollipop");
        versions.add("6.x marshmallow");
        versions.add("7 nougat");
        System.out.println("original:"+versions );
        Collections.shuffle(versions);
        System.out.println("after shuffle:"+versions );
        Collections.sort(versions);
        System.out.println("after sort:"+versions );
        Collections.reverse(versions);
        System.out.println("after reverse:"+versions );
    }
}
