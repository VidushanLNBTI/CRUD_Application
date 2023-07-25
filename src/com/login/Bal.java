package com.login;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import com.db.DB;
import java.sql.Statement;
import java.sql.ResultSet;

public class Bal {
    
    public void insertDataSignup(FieldsGetSet fieldsgetsetObj){
        try{
            String query = "INSERT INTO signup VALUES(null, ?,?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1,fieldsgetsetObj.getFullName());
            ps.setString(2,fieldsgetsetObj.getEmail());
            ps.setString(3,fieldsgetsetObj.getPassword());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "You have signup successfully");
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    public boolean checkLogin(String Email, String Password){
        boolean b = false;
        try{
            String query ="SELECT Email,Password FROM signup WHERE Email='"+Email+"' AND Password = '"+Password+"'";
            Statement st = DB.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()){
                b=true;
            }else{
                JOptionPane.showMessageDialog(null,"Invalid Email or Password Try Again");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
        
        return b;
    }
    
}
