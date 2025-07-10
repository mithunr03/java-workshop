package com.vetias.java.workshop.basics;

import java.util.HashMap;
import java.util.Map;

public class Mapproblrm {
    public static void main(String[] args) {
        Map<Integer ,String> students =new HashMap<>();
        students.put(1006,"mithun");
        students.put(1007,"achu");
        students.put(1008,"jack");
        students.put(1009,"kate");
        students.put(1002,"locke");
        students.put(1003,"rose");
        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
   

    }

}
