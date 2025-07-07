public class Wordcount {
    public static void main(String[]args)
    {
          String sentance ="hii iam goint to demonstrate.121 how to split a string into multiple string and iam ";
        String words[]=sentance.split(" ");
        String sentences[]=sentance.split("\\.");
      
        System.out.println(words.length);
        System.out.println(sentance.length());
        System.out.println(sentences.length);         
        
        
         
    }

    
}

