package com.cht.training;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main72 {
    public static void main(String[] args) {
        System.out.println("Input int");
        //Scanner scanner = new Scanner(System.in);

        String string1 = "";
        try (Scanner scanner = new Scanner(string1)) {
            System.out.println("your input is :" + scanner.nextInt());
        } catch (InputMismatchException ime) {
            System.out.println("format is worng,stack trace is:");
            ime.printStackTrace();
        } catch (NoSuchElementException nsee) {
            System.out.println("input is not enough");
        } catch (IllegalStateException ise) {
            System.out.println("illegal state");
        }
    }
}