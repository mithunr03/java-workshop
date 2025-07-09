package src.com.vetias.java.workshop.standardlibs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterBased {
    public static void main(String[] args) {
        try (BufferedReader reader=new BufferedReader(new FileReader("README2.md")))
        {
            String line;
            while((line=reader.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            System.out.println("file not found...!");
            e.printStackTrace();
           
            
            
        }
    
        } 
    }
    

