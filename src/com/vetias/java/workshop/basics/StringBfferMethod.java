import java.util.Scanner;

public class StringBfferMethod {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your gender (male/female): ");
    String gender = scanner.nextLine();

    System.out.print("Enter your qualification: ");
    String qualification = scanner.nextLine();

    StringBuffer sb = new StringBuffer();
    if("male".equalsIgnoreCase(gender)) {
        sb.append("Mr. ").append(name).append(" ").append(qualification);
    } else{
        sb.append("Ms. ").append(name).append(qualification);

    }
    System.out.println(sb.toString());
    


    
    
 }   
}
