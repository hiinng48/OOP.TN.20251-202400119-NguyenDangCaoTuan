package com.hust.kstn.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "large_file.txt"; 
        
        try {
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
            long startTime = System.currentTimeMillis();
            
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char)b; // creates many new String objects -> inefficient
            }
            
            long endTime = System.currentTimeMillis();
            System.out.println("GarbageCreator (using '+') took: " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}