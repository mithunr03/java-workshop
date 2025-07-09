package src.com.vetias.java.workshop.basics;
public class Student {
    public static void main(String[]args){
        String[] [] students =
        {
            {"001","achu"},{"002","mithun"},{"003","jack"},{"004","michael"},{"005","kate"}

        };
        System.out.println("roll number and name ");
        for(int i=0;i<students.length;i++)
        {
            System.out.printf("%s%n%s%n",students[i][0], students[i][1]);
        }

    }
    
}
