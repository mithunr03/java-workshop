package src.com.vetias.java.workshop.standardlibs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyUsingBinary {
    public static void main(String[] args) {
        try(FileInputStream inputStream=new FileInputStream("download.jpg");
        FileOutputStream outputStream= new FileOutputStream("mithun.jpg"))
        {
            byte[] chunk=new byte[2048];
            int byteRead;
            while ((byteRead=inputStream.read(chunk))!=-1) {
                outputStream.write(chunk,0,byteRead );
                
            }
        }catch(IOException e)
        {
            System.out.println("error in reading or writing");
        }

    }
    
}
