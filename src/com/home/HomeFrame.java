
package com.home;

import java.awt.Toolkit;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HomeFrame extends javax.swing.JFrame {

   

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
        this.setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Home.png")));
        loadTable();
    }

    public void loadAllDataIntoTable(List<HomeFieldsGetSet> list){
            DefaultTableModel dtm = (DefaultTableModel) table1.getModel();
            dtm.setRowCount(0);

            for (HomeFieldsGetSet fieldsgetset : list) {
                Vector v = new Vector();
                v.add(fieldsgetset.getIndexNo());
                v.add(fieldsgetset.getSubject());
                v.add(fieldsgetset.getGrade());

                dtm.addRow(v);
        }
            
    }
    
    public void loadTable(){
        HomeBal bal = new HomeBal();
        List<HomeFieldsGetSet> list = bal.loadData();
        loadAllDataIntoTable(list);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboboxGrade = new javax.swing.JComboBox<>();
        comboboxSubject = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 54, 77));
        jLabel1.setText("Student Grade Management System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 6, 526, -1));

        jSeparator1.setBackground(new java.awt.Color(32, 54, 77));
        jSeparator1.setForeground(new java.awt.Color(32, 54, 77));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 55, 512, 21));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 70));

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(32, 54, 77)), "HOME", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(32, 54, 77))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(32, 54, 77));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 204, 0), null, new java.awt.Color(255, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpdate.setBackground(new java.awt.Color(255, 204, 204));
        btnUpdate.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 102));
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), null, new java.awt.Color(255, 0, 0)));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel4.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 110, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 54, 77));
        jLabel3.setText("Grade :");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 54, 77));
        jLabel4.setText("Subject :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        comboboxGrade.setBackground(new java.awt.Color(204, 204, 204));
        comboboxGrade.setEditable(true);
        comboboxGrade.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        comboboxGrade.setForeground(new java.awt.Color(32, 54, 77));
        comboboxGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", " " }));
        comboboxGrade.setAutoscrolls(true);
        comboboxGrade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboboxGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboboxGrade.setName("grade"); // NOI18N
        jPanel4.add(comboboxGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 220, -1));

        comboboxSubject.setBackground(new java.awt.Color(204, 204, 204));
        comboboxSubject.setEditable(true);
        comboboxSubject.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        comboboxSubject.setForeground(new java.awt.Color(32, 54, 77));
        comboboxSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maths", "Operating-system", "Data-structures", "BMRS", "Physics", "Quality-assuarance", "Test-integration" }));
        comboboxSubject.setAutoscrolls(true);
        comboboxSubject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboboxSubject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboboxSubject.setName("subject"); // NOI18N
        jPanel4.add(comboboxSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 220, -1));

        btnDelete.setBackground(new java.awt.Color(255, 204, 204));
        btnDelete.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 102));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), null, new java.awt.Color(255, 0, 0)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 110, 30));

        btnAdd.setBackground(new java.awt.Color(255, 204, 204));
        btnAdd.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 102));
        btnAdd.setText("ADD");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), null, new java.awt.Color(255, 0, 0)));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 110, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 380, 430));

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), null, new java.awt.Color(255, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setBackground(new java.awt.Color(204, 204, 204));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index Number", "Subject", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 410));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 390, 430));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 860, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String Subject = (String) comboboxSubject.getSelectedItem();
        String Grade = (String) comboboxGrade.getSelectedItem();
        HomeFieldsGetSet fieldsgetset = new HomeFieldsGetSet(IndexNo, Subject, Grade);
        HomeBal bal = new HomeBal();
        bal.updateData(fieldsgetset);
        loadTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

       if (IndexNo == 0) {
            JOptionPane.showMessageDialog(null, "Please select a record to delete.");
            return;
        }
        HomeBal bal = new HomeBal();
        bal.deleteRecord(IndexNo);
        loadTable();
        IndexNo = 0; // Reset the IndexNo after deletion
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String Subject = (String) comboboxSubject.getSelectedItem();
        String Grade = (String) comboboxGrade.getSelectedItem();
        
        HomeFieldsGetSet homefeildsgetset = new HomeFieldsGetSet(0, Subject, Grade);
        
        HomeBal homeObj = new HomeBal();
        homeObj.insert(homefeildsgetset);
        loadTable();
    }//GEN-LAST:event_btnAddActionPerformed

    int IndexNo = 0;//global variable

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
       int row = table1.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a record from the table.");
            return;
        }
        IndexNo = (int) table1.getValueAt(row, 0);
        comboboxSubject.setSelectedItem(table1.getValueAt(row, 1));
        comboboxGrade.setSelectedItem(table1.getValueAt(row, 2));
    }//GEN-LAST:event_table1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboboxGrade;
    private javax.swing.JComboBox<String> comboboxSubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
