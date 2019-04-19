package com.cht.training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main41 {
    private static  final  String[] attributes = {"creationTime","size","isDirectory"};
    private static  final  String[] description = {"creationTime","size","isDirectory"};

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".idea\\workspace.xml");
        System.out.printf("read:%b,wirte:%b,executable:%b\n",
                Files.isReadable(path),Files.isWritable(path),Files.isExecutable(path));
        for (int i = 0 ; i< 3;i++){
            Object object = Files.getAttribute(path,attributes[i], LinkOption.NOFOLLOW_LINKS);
            System.out.printf("[%s]==>%s\n",description[i],object);
        }

    }
}
