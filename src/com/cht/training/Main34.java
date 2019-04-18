package com.cht.training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main34 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream inputStream = new FileInputStream("data\\Employee.class")) {
            byte[] buffer = new byte[4];
            if (inputStream.read(buffer) != -1) {
                System.out.printf("buffer=[%s],[%s],[%s],[%s]\n",
                        Integer.toHexString(buffer[0]).toUpperCase(),
                        Integer.toHexString(buffer[1]).toUpperCase(),
                        Integer.toHexString(buffer[2]).toUpperCase(),
                        Integer.toHexString(buffer[3]).toUpperCase());
            }

        }
    }
}
