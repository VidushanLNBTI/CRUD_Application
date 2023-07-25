package com.db;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class DB {
    public static Connection con = null;
    public static void loadConnection(){
        
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url ="jdbc:sqlserver://localhost:1433;databaseName=TXInstitute";
        String user = "sa";
        String pass = "TXInstitute";
        
        try{
            con = DriverManager.getConnection(url, user, pass);
            
            if (con != null){
                JOptionPane.showMessageDialog(null, "database has been successfully connected..");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "error in database loading " +e);
        }
    }
}
