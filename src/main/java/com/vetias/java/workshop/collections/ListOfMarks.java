package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOfMarks {
    public static void main(String[] args) {
        List<Integer> marks =new ArrayList<>();
        marks.add(90);
        marks.add(89);
        marks.add(87);
        marks.add(99);
        System.out.println("marks in ascending order:");
       Collections.sort(marks);
        System.out.println(marks);
        System.out.println("descending order:");
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);


        
    }
    }


