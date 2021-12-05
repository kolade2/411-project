package Restuarant_management;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariaorantes
 */
public class Connect
{
public static void main (String[] args)
{
    Connection conn = null;
    try{
    String userName = "testuser";
    String password = "testpass";
    String url = "jdbc:mysql://204.8.153.50/test";
    Class.forName ("com.mysql.jdbc.Driver").newInstance ();
    conn = DriverManager.getConnection (url, userName, password);
    System.out.println ("Database connection established");
    }
    catch (Exception e){
    System.err.println ("Cannot connect to database server");
    }
    finally{
    if (conn != null){
    try{
        conn.close ();
    System.out.println ("Database connection terminated");
    }
        catch (Exception e) { /* ignore close errors */ }
    }
    }
    }
}

