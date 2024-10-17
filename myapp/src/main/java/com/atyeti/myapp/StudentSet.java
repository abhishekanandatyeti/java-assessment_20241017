package com.atyeti.myapp;

import java.util.Set;
import java.util.TreeSet;

public class StudentSet {
    public Set<String> getStudentNames() {
      HashSet<String> student = new HashSet<String>(); 

        student.add("revathi"); 
        student.add("chandra"); 
        student.add("tanuja"); 
        student.add("ram"); 
        student.add("raju");
  
        System.out.println("Original HashSet: "+ student); 
  
    
        List<String> list = new ArrayList<String>(student); 
        Collections.sort(list); 
  

        System.out.println("HashSet elements in sorted order using List: "+ list);   
    }
}
