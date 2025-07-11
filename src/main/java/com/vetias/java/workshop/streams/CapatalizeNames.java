package com.vetias.java.workshop.streams;

import java.util.ArrayList;
import java.util.List;

public class CapatalizeNames{
     public static void main(String[]args)
{
     List<String> names= new ArrayList<>();
    names.add("achu");
    names.add("mithun");
    names.add("jack");
    names.add("kate");
    names.add("locke");
    names.stream().filter(name->name.startsWith("m")||name.startsWith("M")).distinct()
    .map(String::toUpperCase).forEach(System.out::println);   
    }
}


