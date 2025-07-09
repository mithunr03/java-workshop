package com.vetias.java.workshop.basics;
import java.time.LocalTime;

public class RegisterationTime {
    public static void main(String[] args) {
        LocalTime currTime=LocalTime.now();
        LocalTime registrationlimit=LocalTime.of(18, 59, 59);
        int hoursleft=registrationlimit.getHour()-currTime.getHour();
        int minutesleft=registrationlimit.getMinute()-currTime.getMinute();
        int secondsleft=registrationlimit.getSecond()-currTime.getSecond();
        System.out.println("you have "+hoursleft+" hours "+minutesleft+" minutes "+secondsleft+" seconds left ");
    }
    
}
