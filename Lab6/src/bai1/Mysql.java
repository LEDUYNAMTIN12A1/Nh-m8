/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author Nam
 */
public class Mysql {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306";
        var user = "root";
        var password="";
        try(Connection conn = DriverManager.getConnection(url,user,password)){
            System.out.println("Kết nối Mysql thành công");
            System.out.println(conn.getCatalog());
        } catch (SQLException ex) {
            Logger.getLogger(Mysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
