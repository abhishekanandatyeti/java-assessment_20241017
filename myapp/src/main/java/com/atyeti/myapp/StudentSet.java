package com.atyeti.myapp;

import java.util.Set;
import java.util.TreeSet;

public class CollectionExp{
    public static void main(String[] args)
    {
    Hashset<String> student=new Hashset<String>();
      student.add("karthik");
      student.add("supraja");
      student.add("shyam");
      student.add("rajesh");
      student.add("rohit");
      System.out.println("original:"+student);


      List<String> list=new ArrayList<String>(student);
      collection.sort(list);
      System.out.println("The elements after sorting:"+list);
    }
}


