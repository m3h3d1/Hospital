
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Doctor extends javax.swing.JFrame {

    /**
     * Creates new form ClassSearch
     */
    DefaultTableModel model;

    public Doctor() {
        initComponents();

        fillClassJtable(table);
        table.setRowHeight(40);
        table.setShowGrid(true);
    }

    public void refreshJtable() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        fillClassJtable(table);
    }
    
    public void clearFields() {
        txtID.setText("");
        txtName.setText("");
        txtDeptID.setText("");
        txtDesignation.setText("");
        txtSalary.setText("");
        txtWorkingHour.setText("");
        txtVisitingFee.setText("");
        
        table.getSelectionModel().clearSelection();
    }
    
    public void fillClassJtable(JTable table) {

        Connection con = AllConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `doctor_info`");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] row;
            while (rs.next()) {

                row = new Object[8];

                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getString(4);
                row[4] = rs.getInt(5);
                row[5] = rs.getDouble(6);
                row[6] = rs.getInt(7);

                model.addRow(row);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "problem happening");
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnMenu = new javax.swing.JButton();
        LtxtClass = new javax.swing.JLabel();
        LtxtSection = new javax.swing.JLabel();
        LtxtSubject = new javax.swing.JLabel();
        LtxtTeacher = new javax.swing.JLabel();
        LtxtStudent = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDeptID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDesignation = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtWorkingHour = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtVisitingFee = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClearAllFields = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hospital Management System");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 27, 620, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("View Doctors Information");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 492, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 810, 150));

        table.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor ID", "Name", "Dept ID", "Designation ", "Salary", "Working Hour", "Visiting Fee"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 890, 460));

        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMenu.setText("Back");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel5.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, 50));

        LtxtClass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LtxtClass.setAutoscrolls(true);
        jPanel5.add(LtxtClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 370, 40));

        LtxtSection.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LtxtSection.setAutoscrolls(true);
        jPanel5.add(LtxtSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, 370, 40));

        LtxtSubject.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LtxtSubject.setAutoscrolls(true);
        jPanel5.add(LtxtSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 370, 40));

        LtxtTeacher.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LtxtTeacher.setAutoscrolls(true);
        jPanel5.add(LtxtTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 370, 40));

        LtxtStudent.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LtxtStudent.setAutoscrolls(true);
        jPanel5.add(LtxtStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 370, 40));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel5.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 248, 31));

        jLabel2.setText("ID");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 69, 31));

        jLabel3.setText("Name");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 69, 29));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel5.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 248, 29));

        jLabel4.setText("Dept ID");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 69, 33));

        txtDeptID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeptIDActionPerformed(evt);
            }
        });
        jPanel5.add(txtDeptID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 248, 29));

        jLabel7.setText("Designation");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 69, 31));

        txtDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesignationActionPerformed(evt);
            }
        });
        jPanel5.add(txtDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 248, 26));

        jLabel8.setText("Salary");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 69, 35));
        jPanel5.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 248, 28));

        jLabel9.setText("Working Hour");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, 34));

        txtWorkingHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkingHourActionPerformed(evt);
            }
        });
        jPanel5.add(txtWorkingHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 248, 29));

        jLabel10.setText("Visiting Fee");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 69, 31));

        txtVisitingFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVisitingFeeActionPerformed(evt);
            }
        });
        jPanel5.add(txtVisitingFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 248, 31));

        btnAdd.setText("Add New Data");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel5.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 153, 47));

        btnRemove.setText("Remove Data");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel5.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 660, 160, 50));

        btnUpdate.setText("Update Existing Data");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 160, 50));

        btnClearAllFields.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClearAllFields.setText("Clear Text Fields");
        btnClearAllFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllFieldsActionPerformed(evt);
            }
        });
        jPanel5.add(btnClearAllFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 150, 50));

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        model = (DefaultTableModel) table.getModel();
        int rowIndex = table.getSelectedRow();
        try {
            txtID.setText(model.getValueAt(rowIndex, 0).toString());
            txtName.setText(model.getValueAt(rowIndex, 1).toString());
            txtDeptID.setText(model.getValueAt(rowIndex, 2).toString());
            txtDesignation.setText(model.getValueAt(rowIndex, 3).toString());
            txtSalary.setText(model.getValueAt(rowIndex, 4).toString());
            txtWorkingHour.setText(model.getValueAt(rowIndex, 5).toString());
            txtVisitingFee.setText(model.getValueAt(rowIndex, 6).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        MainMenu form = new MainMenu();
        form.setVisible(true);
        dispose();
        form.setResizable(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed

    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtDeptIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeptIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeptIDActionPerformed

    private void txtDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesignationActionPerformed

    public boolean verifyText() {
        if (txtID.getText().equals("") || txtName.getText().equals("") || txtDesignation.getText().equals("") || txtSalary.getText().equals("") ||
                txtWorkingHour.getText().equals("") || txtVisitingFee.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "one or more empty field");
            return false;
        }
        else {
            return true;
        }
    }    
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            int ID = Integer.valueOf(txtID.getText());
            String Name = txtName.getText();
            int DeptID = Integer.valueOf(txtDeptID.getText());
            String Designation = txtDesignation.getText();
            int Salary = Integer.valueOf(txtSalary.getText());
            double WorkingHour = Double.valueOf(txtWorkingHour.getText());
            int VisitingFee = Integer.valueOf(txtVisitingFee.getText());

            if(verifyText()) {
                Connection con = AllConnection.getConnection();
                PreparedStatement ps;

                try {
                    ps = con.prepareStatement("INSERT INTO `Doctor_info`(`DoctorID`, `Name`, `DeptID`, `Designation`, `Salary`, `WorkingHour`, `VisitingFee`) "
                        + "VALUES (?,?,?,?,?,?,?)");

                    ps.setInt(1, ID);
                    ps.setString(2, Name);
                    ps.setInt(3, DeptID);
                    ps.setString(4, Designation);
                    ps.setInt(5, Salary);
                    ps.setDouble(6, WorkingHour);
                    ps.setInt(7, VisitingFee);

                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "New doctor data added");
                    } else {
                        JOptionPane.showMessageDialog(null, "New doctor data not added");
                    }
                    refreshJtable();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error in save");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No data selected");
        } else {
            int id = Integer.parseInt(txtID.getText());
            int x = JOptionPane.showConfirmDialog(null, "Selected data will be deleted", "Delete informantion", JOptionPane.OK_CANCEL_OPTION, 0);
            if (x == JOptionPane.OK_OPTION) {
                try {
                    Connection con = AllConnection.getConnection();
                    PreparedStatement ps = con.prepareStatement("DELETE FROM `doctor_info` WHERE DoctorID = ?");
                    ps.setInt(1, id);

                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Selected data deleted");
                        clearFields();
                    } else {
                        JOptionPane.showMessageDialog(null, "Selected data not deleted");
                    }

                    refreshJtable();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtVisitingFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVisitingFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVisitingFeeActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            int ID = Integer.valueOf(txtID.getText());
            String Name = txtName.getText();
            String DeptID = txtDeptID.getText();
            String Designation = txtDesignation.getText();
            String Salary = txtSalary.getText();
            String WorkingHour = txtWorkingHour.getText();
            String VisitingFee = txtVisitingFee.getText();

            if(verifyText()) {
                Connection con = AllConnection.getConnection();
                try {
                    PreparedStatement ps = con.prepareStatement("UPDATE `doctor_info` SET `Name`=?,`DeptID`=?,`Designation`=?,`Salary`=?,`WorkingHour`=?,`VisitingFee`=? WHERE `DoctorID`=?");

                    ps.setInt(7, ID);
                    ps.setString(1, Name);
                    ps.setString(2, DeptID);
                    ps.setString(3, Designation);
                    ps.setString(4, Salary);
                    ps.setString(5, WorkingHour);
                    ps.setString(6, VisitingFee);

                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "data updated");
                    } else {
                        JOptionPane.showMessageDialog(null, "data didn't update");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }

                refreshJtable();
            }
            else {
                JOptionPane.showMessageDialog(null, "data is not verified");
            }

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error in Update");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearAllFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllFieldsActionPerformed
        clearFields();
    }//GEN-LAST:event_btnClearAllFieldsActionPerformed

    private void txtWorkingHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWorkingHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWorkingHourActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LtxtClass;
    private javax.swing.JLabel LtxtSection;
    private javax.swing.JLabel LtxtStudent;
    private javax.swing.JLabel LtxtSubject;
    private javax.swing.JLabel LtxtTeacher;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClearAllFields;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtDeptID;
    private javax.swing.JTextField txtDesignation;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtVisitingFee;
    private javax.swing.JTextField txtWorkingHour;
    // End of variables declaration//GEN-END:variables
}
