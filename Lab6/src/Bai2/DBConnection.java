/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nam
 */
public class DBConnection {
    public static void main(String[] args) {
        var server = "NAM-PC\\SQLEXPRESS";
        var user = "sa";
        var password = "01056789";
        var db = "quanly";
        var port = 1433;
        SQLServerDataSource ds= new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);
        try (Connection conn = ds.getConnection()){
       
            System.out.println("Kết nối thành công SQL server !");
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
}
