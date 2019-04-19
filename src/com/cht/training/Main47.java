package com.cht.training;

import java.io.IOException;
import java.nio.file.*;

public class Main47 {
    public static void main(String[] args) throws InterruptedException{
        Path path = Paths.get(".\\");
        WatchService service = null;
        try{
            service = path.getFileSystem().newWatchService();
            path.register(service, StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_DELETE,StandardWatchEventKinds.ENTRY_MODIFY);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("start listening file system change");

    }
}
