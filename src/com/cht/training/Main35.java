package com.cht.training;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main35 {
    private static final String FILENAME = "data\\README.TXT";

    public static void main(String[] args) throws IOException {
        try(DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(FILENAME))){
            for (int i=0;i<30;i++){
                outputStream.writeByte(i);
                outputStream.writeInt(i);
                outputStream.writeLong(i);
                outputStream.writeDouble(i);
            }

        }
    }
}
