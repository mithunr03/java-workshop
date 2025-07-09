package src.com.vetias.java.workshop.basics;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ParseMethod {
       public static void main(String[] args) {
        Scanner inputScanner=new Scanner(System.in);
        System.out.printf("Enter your birth year(mm/dd/yyyy):");
        String birthyear=inputScanner.next();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/mm/yyyy");
        LocalDate birthDate= LocalDate.parse(birthyear);
        int yearofbirth=birthyear.getYear();
        int year=LocalDate.now().getYear();
        int finalyear=(year-birthyear);

        System.out.println("age:"+finalyear);
        inputScanner.close();
    }
    
    
}
