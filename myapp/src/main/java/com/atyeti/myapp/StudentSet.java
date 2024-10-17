package com.atyeti.myapp;

import java.util.Set;
import java.util.TreeSet;

public class StudentSet {
    public Set<String> getStudentNames()
     {
        HashSet<String> students=new HashSet<String>
        /*
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");
        */
       Arrays.sort(students);
       for(int i:students)
       {
        students.get(i);
       }
        return null;
    }
}
