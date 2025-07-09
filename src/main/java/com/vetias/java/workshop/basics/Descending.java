package com.vetias.java.workshop.basics;
import java.util.Arrays;
import java.util.Collections;

public class Descending{
    public static void main(String[]args)
    {
        Double[]prices ={30.24,56.32,23.03,29.03,24.03};
        Arrays.sort(prices, Collections.reverseOrder());
        System.out.println("list in descending order");
        for(Double price:prices)
        {
            System.out.println(price);
        }

    }
}