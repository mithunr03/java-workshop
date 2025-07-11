package com.vetias.java.workshop.streams;

import java.util.Arrays;

public class ArraysMarks {
    public static void main(String[] args) {
        
    
  int [] marks={90,89,89,99,93};
  long passed=Arrays.stream(marks).filter(mark -> mark >40).count();
  System.out.println(passed);

}
}
