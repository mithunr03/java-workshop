package com.vetias.java.workshop.tempdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import com.vetias.java.workshop.tempdata.beans.Organization;
import com.vetias.java.workshop.tempdata.dao.OrganizationDAO;

public class JdbcExample {
        public static void main(String[] args) {
           Connection dbConnection=null;
           try{
            Class.forName("org.h2.Driver");
           }catch(ClassNotFoundException e){
            e.printStackTrace();
           }
           try{
            dbConnection=DriverManager.getConnection("jdbc:h2:mem:tempdataDB","sa",null);

           }catch(SQLException sqlException)
            {
                System.out.println("error creating table:"+sqlException);
            }
            OrganizationDAO organizationDAO=new OrganizationDAO();
            organizationDAO.createTable(dbConnection);
            Organization vet=new Organization( "vet",
            "thindal erode",
            "vet@gmail.com",
            "www.vetias.com"
            ,"9790547219",
            "vellalar education trust",
            999402L,
            LocalDate.of(1960, 07, 20) );
           
        }        


}
