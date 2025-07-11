package com.vetias.java.workshop.streams;
import java.util.Arrays;

public class ListOfMarksUsingSort {
    public static void main(String[] args) 
    {
     int[]marks={90,99,89,90,99};
     Arrays.stream(marks).sorted().forEach(System.out::println);


    }
}
