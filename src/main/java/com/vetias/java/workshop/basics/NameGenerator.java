package src.com.vetias.java.workshop.basics;
import java.util.Scanner;
public class NameGenerator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        System.out.printf("enter your name:");
        String name=input.next();
        System.out.printf("enter your gender: ");       
        String gender=input.next();
        System.out.printf("enter your qualification:");
        String qualification=input.next();
        StringBuilder sb=new StringBuilder();
        if("male".equalsIgnoreCase(gender))
        {
            sb.append("mr.").append(name).append(",").append(qualification);
            String result=sb.toString();
            System.out.println(result);
        
        } 
        else if("female".equalsIgnoreCase(gender))
        {
            sb.append("ms").append(gender).append(",").append(qualification);  
            String result=sb.toString();
            System.out.println(result);
        } 
        else{
            System.out.println("enter a valid gender");
        }      
    }
    
}
