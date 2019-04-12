package com.cht.training;

public class Main9 {
    public Main9() {
        System.out.println("this line should be called");
        //return 500;
    }

    public void  Main9() {
        System.out.println("this method should not exist");
        //return 500;
    }

    public void writeSomething(){
        System.out.println("empty...");
    }

    public void writeSomething(String content){
        System.out.println("content"+content);
    }

    public void writeSomething(String content,int times){
        String result = "";
        for (int i = 0 ; i < times ; i++)
        {
            result += content;
        }
        System.out.println("content="+result);
    }

    public static void main(String[] args) {
        Main9 m9 = new Main9();
        m9.writeSomething();
        m9.writeSomething("Hello world");
        m9.writeSomething("Hi",5);
        m9.Main9();
    }
}
