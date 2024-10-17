package com.atyeti.myapp;

import java.util.Set;
import java.util.TreeSet;

public class StudentSet {
        // HashSet to store student names and avoid duplicates
        HashSet<String> studentNames = new HashSet<>();

        studentNames.add("Jyoti");
        studentNames.add("Rutuja");
        studentNames.add("Aarti");
        studentNames.add("Sam");
        studentNames.add("Sakshi");
        studentNames.add("Jyoti");  // Duplicate, will be ignored

        List<String> sortedNames = new ArrayList<>(studentNames); //For sorting the names
        Collections.sort(sortedNames);

        // Display the sorted and unique student names
        System.out.println("Student names in sorted order:");
        for (String name : sortedNames) {
            System.out.println(name);
    }
}
