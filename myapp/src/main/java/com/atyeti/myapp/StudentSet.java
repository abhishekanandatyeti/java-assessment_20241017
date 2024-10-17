package com.atyeti.myapp;

import java.util.Set;
import java.util.TreeSet;

public class StudentSet {
    public Set<String> getStudentNames() {
    Set<String> studentNames = new HashSet<>();
        studentNames.add("Sumit");
        studentNames.add("Shubham");
        studentNames.add("pratik");
        studentNames.add("Pranav");
        studentNames.add("Rohit");
        studentNames.add("Sumit");
        TreeSet<String> StudentSort = new TreeSet<>(studentNames);
        System.out.println("Sorted list of student names:");
        for (String name : StudentSort) {
            System.out.println(name);
        }
}
        return null;
    }

