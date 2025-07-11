package com.vetias.java.workshop.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SplitingOddAndEven {
    public static void main(String[] args) {
    List<Integer> no=Arrays.asList(22,23,242,53,67,78,89,22);
    Map<Boolean, List<Integer>> finalresult = no.stream()
        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
    System.out.println("Even numbers: " + finalresult.get(true));
    System.out.println("Odd numbers: " + finalresult.get(false));   
    }
}
