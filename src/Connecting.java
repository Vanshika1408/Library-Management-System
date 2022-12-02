/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahaj
 */
//jdbc - java database connectivity. accessing relational database with java and executing queries
import java.sql.*; //interfaces for queries
public class Connecting {
    Connection c; //connection interface
    Statement s;  //statement interface
    public Connecting(){
        try{
            Class.forName("com.mysql.jdbc.Driver"); //driver registering. forname static method (library importing)
            c =DriverManager.getConnection("jdbc:mysql:///LibraryManagement","root",""); 
            //establishing connection. drivermanager.getconnection static method(connection url);
            s=c.createStatement(); //statement creation for executing queries
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
