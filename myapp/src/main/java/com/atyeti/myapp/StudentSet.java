package com.atyeti.myapp;

import java.util.Set;
import java.util.TreeSet;

public class StudentSet {
    Set<String> set = new TreeSet<String>();

        set.add("Rohit");
        set.add("Akshay");
        set.add("Swapnil");
        set.add("Ashutosh");
        set.add("vishal");

        for(String st:set){
        System.out.println(st);
    }

}
