package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighMarks {
    public static void main(String[] args) {
        List<Integer> marks =new ArrayList<>();
        marks.add(90);
        marks.add(89);
        marks.add(87);
        marks.add(99);
        System.out.println("highest mark:");
        Collections.sort(marks);
        System.out.println(marks.getLast());


        
    }
    }

