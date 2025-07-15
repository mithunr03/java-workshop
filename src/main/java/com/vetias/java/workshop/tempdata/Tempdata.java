package com.vetias.java.workshop.tempdata;



import com.vetias.java.workshop.tempdata.beans.Organization;

public class Tempdata {
    public static void main(String[]args){
        // String setName = "VET Thindal";
        // double altitude = 10.123456;
        // double alongitude = 78.123456;
        // String setAdress = "thindal , erode,tamilnadu,india";
        // String setPostalcode = "6390012";
        // String setContact = "9790547219";

        // System.out.println("name:" + setName);
        // System.out.println("latitude:" + altitude);
        // System.out.println("longitude:" + alongitude);
        // System.out.println("set address:" + setAdress);
        // System.out.println("set postal code:" + setPostalcode);
        // System.out.println("set contact:" + setContact);
        Organization vet=new Organization("Vellalar Educational Trust", "vet@gmail.com","www.vetias.com","9790547219","VET "
                                          ,9223344);
        System.out.println(vet);

      }
    
}
