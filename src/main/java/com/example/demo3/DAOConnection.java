
package com.example.demo3;

import java.sql.*;


public  class DAOConnection {
static Connection con;
static String username = null;
static String password = "";

 
   public static Connection sqlconnection(){
       try{
           String dbUrl = "jdbc:mysql://localhost:3306/servletproject";
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           con=DriverManager.getConnection(dbUrl,"root","");              
           System.out.println("Connection established for SQL");
       }catch(Exception e){
           System.out.println("Database connection exception="+e);
       }
       return con;    
    
}    
    
}
