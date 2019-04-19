package com.cht.training;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main40 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("");
        Path path2 = Paths.get("");
        System.out.println("compare using file:" + Files.isSameFile(path1, path2));
    }

    private static boolean isDirectory(Path path) throws FileNotFoundException {
        if (Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
            if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
                return true;
            } else {
                return false;
            }

        } else {
            throw new FileNotFoundException();
        }
    }
}
