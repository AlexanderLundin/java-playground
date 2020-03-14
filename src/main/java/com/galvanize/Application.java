package com.galvanize;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world");
        List<String> fileNames = Arrays.asList("My Report.csv", "The Best Deck.pdf", "Thanks for all the fishes.doc");
        fileNames.forEach(fileName -> {
            String newFileName = fileName.replace(" ", "-");
            System.out.println(newFileName);
        });
        System.out.println(fileNames);
    }
}
