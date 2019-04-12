package com.cht.training;

public class Main27 {
    public static void main(String[] args) {
        String s1="Hello:";
        for (int i=0;i<10;i++){
            s1 += "$";
        }
        System.out.println(s1);

        //好的寫法.上面的寫法會讓immutable字.加一個$,記憶體一直被指配新的
        StringBuilder builder = new StringBuilder(s1);
        for (int i=0;i<10;i++){
            builder.append("$");
        }
        System.out.println(builder.toString());
    }
}
