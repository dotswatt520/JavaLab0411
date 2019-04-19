package com.cht.training;

import com.sun.xml.internal.ws.policy.AssertionSet;

import java.util.Arrays;

class Asset implements Comparable<Asset>{
    private String name;
    private int twd;
    private int usd;
    private static final int RATE = 31;

    public Asset(String name, int twd, int usd) {
        this.name = name;
        this.twd = twd;
        this.usd = usd;
    }

    @Override
    public String toString() {
        return String.format("[%s]TWD==>%d,usd==>%d,total==>%d",
                name,twd,usd,twd+usd*RATE);
    }

    @Override
    public int compareTo(Asset o) {
        int thisVale=twd+usd*RATE;
        int otherValue = o.twd+o.usd*RATE;
        return  thisVale-otherValue;
    }
}
public class Main63 {
    public static void main(String[] args) {
        Asset[] customers = {new Asset("Mark",0,100),new Asset("John",0,100),
                new Asset("Tim",50,50),new Asset("Ken",75,25)};
        System.out.println(("original"+ Arrays.toString(customers)));
        Arrays.sort(customers);
        System.out.println("after sort:"+Arrays.toString(customers));
    }
}
