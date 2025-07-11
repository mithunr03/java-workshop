package com.vetias.java.workshop.streams;

import java.util.ArrayList;
import java.util.List;

public class NamesStartsWiths {
 public static void main(String[] args) {
        
    
    List<String> names= new ArrayList<>();
    names.add("achu");
    names.add("mithun");
    names.add("jack");
    names.add("kate");
    names.add("locke");
    long nameCount=names.stream().filter(name->name.startsWith("m")).distinct().count();
    System.out.println(nameCount);

}
}
