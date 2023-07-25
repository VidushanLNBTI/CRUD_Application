//
//package com.home;
//
//import com.db.DB;
//import java.sql.PreparedStatement;
//import java.util.ArrayList;
//import java.util.List;
//import javax.swing.JOptionPane;
//import java.sql.ResultSet;
//
//public class HomeBal {
//    
//    
//    //method for read data
//    public List<HomeFieldsGetSet> loadData(){
//        List<HomeFieldsGetSet> list = new ArrayList<HomeFieldsGetSet>();
//        try{
//            String query = "SELECT * FROM home";
//            PreparedStatement ps = DB.con.prepareStatement(query);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()){
//                int IndexNo = rs.getInt("IndexNo");
//                String Subject = rs.getString("Subject");
//                String Grade = rs.getString("Grade");
//                
//                HomeFieldsGetSet fieldsgetset = new HomeFieldsGetSet(IndexNo,Subject,Grade);
//                list.add(fieldsgetset);
//            }
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, ""+e);
//        }
//        return list;
//    }
//    
//    
//    public void insert(HomeFieldsGetSet homefieldsgetset){
//        try{
//            String query = "INSERT INTO home VALUES (?, ?, ?)";
//            PreparedStatement ps = DB.con.prepareStatement(query);
//            ps.setInt(1, homefieldsgetset.getIndexNo());
//            ps.setString(2, homefieldsgetset.getSubject());
//            ps.setString(3, homefieldsgetset.getGrade());
//            
//            ps.executeUpdate();
//            JOptionPane.showMessageDialog(null, "A record has been successfully inserted");
//            
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//            
//    }
//    // create method for update
//    public HomeFieldsGetSet returnAllDataToTextFields(int IndexNo){
//            HomeFieldsGetSet fieldsgetset = null;
//            try{
//                String query = "SELECT * FROM home WHERE IndexNo = ?";
//                PreparedStatement ps = DB.con.prepareStatement(query);
//                ResultSet rs = ps.executeQuery();
//                while (rs.next()){
////                    int ids = rs.getInt("Id");
//                    int IndexNos = rs.getInt("IndexNo");
//                    String Subject = rs.getString("Subject");
//                    String Grade = rs.getString("Grade");
//                    fieldsgetset = new HomeFieldsGetSet(IndexNos, Subject, Grade);
//                }
//            }catch(Exception e){
//                JOptionPane.showMessageDialog(null, ""+e);
//            }
//            return fieldsgetset;
//        }
//    
//    public void updateData(HomeFieldsGetSet fieldsgetset){
//        try{
//            String query = "UPDATE home SET Subject=?, Grade=? WHERE IndexNo=?";
//            PreparedStatement ps = DB.con.prepareStatement(query);
//            
//            ps.setString(1, fieldsgetset.getSubject());
//            ps.setString(2, fieldsgetset.getGrade());
//            ps.setInt(3, fieldsgetset.getIndexNo());
//            
//            ps.executeUpdate();
//            JOptionPane.showMessageDialog(null, "A record has been successfully inserted");
//        }catch(Exception e ){
//            JOptionPane.showMessageDialog(null, ""+e);
//        }
//    }
//    
//    public void deleteRecord(String IndexNo){
//        try{
//            String query = "DELETE FROM home WHERE IndexNo=?";
//            PreparedStatement ps = DB.con.prepareStatement(query);
//            ps.setString(1, IndexNo);
//            ps.executeUpdate();
//            JOptionPane.showMessageDialog(null, "A record has been successfully deleted");
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
//
//    void deleteRecord(int IndexNo) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//}
//
package com.home;

import com.db.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HomeBal {

    public List<HomeFieldsGetSet> loadData() {
        List<HomeFieldsGetSet> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM home";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int IndexNo = rs.getInt("IndexNo");
                String Subject = rs.getString("Subject");
                String Grade = rs.getString("Grade");

                HomeFieldsGetSet fieldsgetset = new HomeFieldsGetSet(IndexNo, Subject, Grade);
                list.add(fieldsgetset);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e);
        }
        return list;
    }

    public void insert(HomeFieldsGetSet homefieldsgetset) {
        try {
            String query = "INSERT INTO home (Subject, Grade) VALUES (?, ?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, homefieldsgetset.getSubject());
            ps.setString(2, homefieldsgetset.getGrade());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been successfully inserted");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public HomeFieldsGetSet returnAllDataToTextFields(int IndexNo) {
        HomeFieldsGetSet fieldsgetset = null;
        try {
            String query = "SELECT * FROM home WHERE IndexNo = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(1, IndexNo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String Subject = rs.getString("Subject");
                String Grade = rs.getString("Grade");
                fieldsgetset = new HomeFieldsGetSet(IndexNo, Subject, Grade);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e);
        }
        return fieldsgetset;
    }

    public void updateData(HomeFieldsGetSet fieldsgetset) {
        try {
            String query = "UPDATE home SET Subject = ?, Grade = ? WHERE IndexNo = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);

            ps.setString(1, fieldsgetset.getSubject());
            ps.setString(2, fieldsgetset.getGrade());
            ps.setInt(3, fieldsgetset.getIndexNo());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been successfully updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e);
        }
    }

    public void deleteRecord(int IndexNo) {
        try {
            String query = "DELETE FROM home WHERE IndexNo = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(1, IndexNo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been successfully deleted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

