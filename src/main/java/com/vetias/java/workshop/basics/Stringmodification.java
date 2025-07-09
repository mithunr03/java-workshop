package src.com.vetias.java.workshop.basics;
public class Stringmodification
{
    public static void main(String[]args)
    {
        // String fisrtname="mithun";
        // String secondname ="achu";
        // String finalname= fisrtname.concat(secondname);
        // System.out.println(finalname.toUpperCase());
        String sentance ="hii iam goint to demonstrate how to split a string into multiple string and iam ";
        String words[]=sentance.split(".");
        // System.out.println(words.length);
        for(String word:words)
        {
            System.out.println(word.length());
        }
        
    }
}