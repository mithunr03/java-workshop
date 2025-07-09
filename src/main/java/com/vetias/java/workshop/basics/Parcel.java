package src.com.vetias.java.workshop.basics;
import java.util.Arrays;

public class Parcel{
    public static void main(String[]args)
    {
        double[]prices ={300,700,23.55,90.55,45.55};
        Arrays.sort(prices);
        System.out.println("list in ascending order");
        for(double price:prices)
        {
            System.out.println(price);
        }

    }
}