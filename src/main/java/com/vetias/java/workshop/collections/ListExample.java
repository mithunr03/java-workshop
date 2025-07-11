package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        
    
    List<String> names= new ArrayList<>();
    names.add("achu");
    names.add("mithun");
    names.add("jack");
    names.add("kate");
    names.add("locke");
    System.out.println(names.set(1, "achu"));
    // for(int i=0;i<names.size();i++)
    // {
    //    System.out.println(names.get(i));
    // }
    

    // }
    names.forEach(System.out::println);
    names.sort(Comparator.reverseOrder());
    System.out.println(names);



     } 
    }
