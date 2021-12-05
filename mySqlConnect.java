/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restuarant_management;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author koladeadegbaye
 */
public class mySqlConnect {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            JOptionPane.showMessageDialog(null, "Connected to database");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
