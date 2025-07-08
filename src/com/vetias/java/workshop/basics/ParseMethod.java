import java.time.LocalDate;
import java.util.Scanner;

public class ParseMethod {
       public static void main(String[] args) {
        Scanner inputScanner=new Scanner(System.in);
        System.out.printf("Enter your birth year:");
        String birthyear=inputScanner.next();
        LocalDate birthDate= LocalDate.parse(birthyear);
        int year=birthDate.getYear();
        int finalyear=(birthDate-year);

        System.out.println("age:"+finalyear);
        inputScanner.close();
    }
    
    
}
