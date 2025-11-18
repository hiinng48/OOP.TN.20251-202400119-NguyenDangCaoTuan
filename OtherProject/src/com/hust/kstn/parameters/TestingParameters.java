package com.hust.kstn.parameters;

public class TestingParameters {
    public static void main(String[] args) {
        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");
        
        System.out.println("--- Before swap ---");
        System.out.println("First student: " + s1.getName());
        System.out.println("Second student: " + s2.getName());

        swap(s1, s2);
        
        System.out.println("\n--- After ineffective swap ---");
        System.out.println("First student: " + s1.getName());
        System.out.println("Second student: " + s2.getName());

        swapContents(s1, s2);

        System.out.println("\n--- After effective content swap ---");
        System.out.println("First student: " + s1.getName());
        System.out.println("Second student: " + s2.getName());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void swapContents(Student s1, Student s2) {
        String tempName = s1.getName();
        int tempId = s1.getStudentId();
        
        s1.setName(s2.getName());
        s1.setStudentId(s2.getStudentId());

        s2.setName(tempName);
        s2.setStudentId(tempId);
    }
}