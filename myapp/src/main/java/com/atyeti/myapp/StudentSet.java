package com.atyeti.myapp;

import java.util.HashSet;
import java.util.Set;


public class StudentSet {
    public Set<String> getStudentNames() {
        Set<String> students = new HashSet<>();

        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");

        System.out.println("Student names:");
        for (String name : students) {
            System.out.println(name);
        }
        return students;
    }
}
