package com.atyeti.myapp;

import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class StudentSet {
    public Set<String> getStudentNames() {
        HashSet<String> students=new HashSet<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");
        ArrayList<String> set=new ArrayList<>(students);
        Collections.sort(set);
        return set;
    }
}
