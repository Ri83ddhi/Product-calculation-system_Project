/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product_information;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class db {
    ResultSet rs = null;
    PreparedStatement pst = null;

    static Connection conn = null;
    
    public static Connection java_db() {
        String SUrl, SUser, SPass;
        SUrl = "jdbc:mysql://localhost:3306/java_pro_database";
        SUser = "root";
        SPass = "";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = conn.createStatement();
            return conn;

        } catch (Exception e) {
             Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        

    }

    
}
