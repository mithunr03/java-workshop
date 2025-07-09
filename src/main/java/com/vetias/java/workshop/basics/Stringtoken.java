package src.com.vetias.java.workshop.basics;
import java.util.StringTokenizer;

public class Stringtoken {
    public static void main(String[] args) 
    {
        String sentance = "hii iam goint to demonstrate.121 how to split a string into multiple string and iam ";

       
        StringTokenizer wordTokenizer = new StringTokenizer(sentance, " ");
        int wordCount = wordTokenizer.countTokens();

        StringTokenizer sentenceTokenizer = new StringTokenizer(sentance, ".");
        int sentenceCount = sentenceTokenizer.countTokens();

        System.out.println(wordCount);
        System.out.println(sentance.length());
        System.out.println(sentenceCount);          
    }
}
