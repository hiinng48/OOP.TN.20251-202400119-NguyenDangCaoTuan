package com.hust.kstn.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        // This code uses the same 'large_file.txt' as GarbageCreator.
        String filename = "large_file.txt"; 
        
        try {
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
            long startTime = System.currentTimeMillis();
            
            StringBuilder outputStringBuilder = new StringBuilder();
            for (byte b : inputBytes) {
                outputStringBuilder.append((char)b); // uses a mutable StringBuilder -> efficient
            }
            String outputString = outputStringBuilder.toString();
            
            long endTime = System.currentTimeMillis();
            System.out.println("NoGarbage (using StringBuilder) took: " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}