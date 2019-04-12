package com.cht.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main23 {
    private static final String S1 = "信義區:11081 1077 11085 tel:021234567 0988123144 234569 ext 3 6 9 22";

    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("\\d+");
        Matcher matcher1 = pattern1.matcher(S1);

        while (matcher1.find()) {
            System.out.printf("(%s)", matcher1.group());
        }

        Pattern pattern2 = Pattern.compile("\\d{5}");
        Matcher matcher2 = pattern2.matcher(S1);

        while (matcher2.find()) {
            System.out.printf("(%s)", matcher2.group());
        }

        Pattern pattern3 = Pattern.compile("\\b\\d{5}\\b");
        Matcher matcher3 = pattern3.matcher(S1);

        while (matcher3.find()) {
            System.out.printf("(%s)", matcher3.group());
        }

    }
}
