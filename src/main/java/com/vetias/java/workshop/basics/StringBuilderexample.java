package src.com.vetias.java.workshop.basics;
public class StringBuilderexample {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        sb.append("java").append(" ").append("is").append(" ").append("the").append(" ").append("most").append("  ")
        .append("used").append(" ").append("language").append(" ").append("for").append(" ").append("enterprices").append(" ")
        .append("application");
        String restult=sb.toString();
        System.out.println(restult);        
    }
    
}
