package com.vetias.java.workshop.tempdata.dao;
// import org.h2.jdbcx.JdbcDataSource;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.vetias.java.workshop.tempdata.beans.Organization;

public class OrganizationDAO {
//     public void createTable(){
//     JdbcDataSource h2DataSource=new JdbcDataSource();
//     h2DataSource.setUrl("jdbc:h2:mem:tempdataDB");
//     h2DataSource.setUser("sa");
//     try(Connection dbConnection=h2DataSource.getConnection();
//     Statement statement = dbConnection.createStatement()){
//         statement.execute("""
//                 create table organization(id int AUTO_INCREMENT PRIMARY KEY,
//                 NAME VARCHAR(100),
//                 WEBSITE VARCHAR(100),
//                 EMAIL VARCHAR(100),
//                 CONTACT_NUMBER VARCHAR(100),
//                 REGISTRATION_NO INT,
//                 ADDRESS VARCHAR(255))
//                 """);
//     }catch(SQLException sqlException){
//         System.out.println("Error creating table"+sqlException);
//     }
// }public int save(Connection dbConnection, Organaization vet) {
            
//         try( PreparedStatement preparedStatement = dbConnection.prepareStatement("""
//             insert into organization(name, website, email, contact_number, 
//             registration_no, description) 
//             values(?,?,?,?,?,?)
//             """)) {
//                 preparedStatement.setString(1, vet.name());
//                 preparedStatement.setString(2, vet.website());
//                 preparedStatement.setString(3, vet.email());
//                 preparedStatement.setString(4, vet.contactNumber());
//                 preparedStatement.setLong(5, vet.registrationNumber() );
//                 preparedStatement.setString(6, vet.description());
//                 preparedStatement.executeUpdate();
  
//     }catch (SQLException sqlException) {
//         System.out.println("Error inserting into table :" + sqlException);
//     }
//     return 0;
// }
// }
    public void createTable(Connection dbConnection){
        try(Statement statement = dbConnection.createStatement()){
            statement.execute(""" 
                create table organization(id
                int AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(100),
                EMAIL VARCHAR(100),
                WEBSITE VARCHAR(100),
                CONTACT_NUMBER VARCHAR(100),
                REGISTRATION_NO INT,
                DESCRIPTION VARCHAR(255))
            """);
        }catch(SQLException sqlException){
            System.out.println("Error Creating tble:"+sqlException);
        }
    }
    public int save(Connection dbConnection, Organization vet) {
            
        try( PreparedStatement preparedStatement = dbConnection.prepareStatement("""
            insert into organization(name, website, email, contact_number, 
            registration_no, description) 
            values(?,?,?,?,?,?)
            """)) {
                preparedStatement.setString(1, vet.name());
                preparedStatement.setString(2, vet.website());
                preparedStatement.setString(3, vet.email());
                preparedStatement.setString(4, vet.contactNumber());
                preparedStatement.setLong(5, vet.registerationNumber() );
                preparedStatement.setString(6, vet.description());
                preparedStatement.executeUpdate();
  
    }catch (SQLException sqlException) {
        System.out.println("Error inserting into table :" + sqlException);
    }
    return 0;
}
public Organization findByname(Connection dbConnection,String name) {
       Organization organization=null;
      try(PreparedStatement preparedStatement=dbConnection.prepareStatement("""
              select * from organization where name=?
              """)){
        preparedStatement.setString(1, name);
        ResultSet resultSet=preparedStatement.executeQuery();
        if(resultSet !=null && resultSet.next())
        {
            organization =new Organization(
            resultSet.getString("NAME"),
            resultSet.getString("EMAIL"),
            resultSet.getString("WEBSITE"),
            resultSet.getString("CONTACT_NUMBER"),
            resultSet.getString("REGISTRATION_NO"),
            resultSet.getLong("DESCRIPTION")
            );
            

        }

      }catch (SQLException exception) {
        System.out.println("Error finding table :" +exception);
        
      }
      return organization;

    }

}



