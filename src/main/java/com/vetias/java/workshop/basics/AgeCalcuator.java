package src.com.vetias.java.workshop.basics;
import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalcuator {
    public static void main(String[] args) {
        Scanner inputScanner=new Scanner(System.in);
        System.out.printf("Enter your birth year:");
        int birthyear=inputScanner.nextInt();
        int presentyear= LocalDate.now().getYear();
        int finalyear=(presentyear - birthyear);
        System.out.println("age:"+finalyear);
        inputScanner.close();
    }
    
}
