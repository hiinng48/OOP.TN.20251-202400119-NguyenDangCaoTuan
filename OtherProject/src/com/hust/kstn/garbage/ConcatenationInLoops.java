package com.hust.kstn.garbage;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random r = new Random(123);
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 65536; i++) {
            s += r.nextInt(2);
        }
        long end = System.currentTimeMillis();
        System.out.println("Using '+' operator took: " + (end - start) + " ms"); // This prints a high number

        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append(r.nextInt(2));
        }
        s = sb.toString();
        end = System.currentTimeMillis();
        System.out.println("Using StringBuilder took: " + (end - start) + " ms"); // This prints a very low number
    }
}