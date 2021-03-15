import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Patient extends javax.swing.JFrame {

    /**
     * Creates new form ClassSearch
     */
    DefaultTableModel model;

    public Patient() {
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
        DateChooser.setDate(null);
        txtBlood.setText("");
        txtAddress.setText("");
        txtContact.setText("");
        txtEmContact.setText("");
        txtEmail.setText("");
        
        table.getSelectionModel().clearSelection();
    }

    public void fillClassJtable(JTable table) {

        Connection con = AllConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `patient_info`");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] row;
            while (rs.next()) {

                row = new Object[8];

                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);

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
        btnBack = new javax.swing.JButton();
        LtxtClass = new javax.swing.JLabel();
        LtxtSection = new javax.swing.JLabel();
        LtxtSubject = new javax.swing.JLabel();
        LtxtTeacher = new javax.swing.JLabel();
        LtxtStudent = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtBlood = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmContact = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClearAllFields = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hospital Management System");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("View Patient Information");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 810, 150));

        table.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "DoB", "Blood Group ", "Address", "Contact", "Em Contact", "Email"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 1050, 480));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel5.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, 50));

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

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnAdd.setText("Add New Patient");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel5.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 220, 50));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Search By Patient ID:  ");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, -1, -1));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel5.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 90, 290, 60));

        jLabel2.setText("ID");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 141, 31));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel5.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 248, 31));

        jLabel3.setText("Name");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 141, 29));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel5.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 248, 29));

        jLabel4.setText("Date of Birth");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 141, 33));
        jPanel5.add(DateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 248, 36));

        jLabel7.setText("Blood Group");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 141, 31));

        txtBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodActionPerformed(evt);
            }
        });
        jPanel5.add(txtBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 248, 31));

        jLabel8.setText("Address");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 141, 35));
        jPanel5.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 248, 35));

        jLabel9.setText("Contact Number");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 141, 34));
        jPanel5.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 248, 34));

        jLabel10.setText("Emergency Contact Number");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, 31));
        jPanel5.add(txtEmContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 248, 31));

        jLabel11.setText("Email");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 141, 32));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel5.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 248, 32));

        btnRemove.setText("Remove Selected Data");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel5.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 690, 220, 50));

        btnUpdate.setText("Update Existing Data");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 220, 50));

        btnClearAllFields.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnClearAllFields.setText("Clear Text Fields");
        btnClearAllFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllFieldsActionPerformed(evt);
            }
        });
        jPanel5.add(btnClearAllFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, 50));

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel5.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 100, 110, 40));

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        model = (DefaultTableModel) table.getModel();
        int rowIndex = table.getSelectedRow();
        try {
            txtID.setText(model.getValueAt(rowIndex, 0).toString());
            txtName.setText(model.getValueAt(rowIndex, 1).toString());
            try {
                Date bdate = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 2).toString());
                DateChooser.setDate(bdate);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            txtBlood.setText(model.getValueAt(rowIndex, 3).toString());
            txtAddress.setText(model.getValueAt(rowIndex, 4).toString());
            txtContact.setText(model.getValueAt(rowIndex, 5).toString());
            txtEmContact.setText(model.getValueAt(rowIndex, 6).toString());
            txtEmail.setText(model.getValueAt(rowIndex, 7).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainMenu form = new MainMenu();
        form.setVisible(true);
        dispose();
        form.setResizable(false);
    }//GEN-LAST:event_btnBackActionPerformed

    public boolean verifyText() {
        if (txtID.getText().equals("") || txtName.getText().equals("") || txtBlood.getText().equals("") || txtAddress.getText().equals("") ||
                DateChooser.getDate() == null || txtContact.getText().equals("") || txtEmContact.getText().equals("") || txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "one or more empty field");
            return false;
        } /// choose a date higher than the current date
        else if (DateChooser.getDate().compareTo(new Date()) > 0) {
            JOptionPane.showMessageDialog(null, "invalid date");
            return false;
        } else {
            return true;
        }
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
//        AddPatient form = new AddPatient();
//        form.setVisible(true);
//        dispose();
//        form.setResizable(false);
        try {
            int ID = Integer.valueOf(txtID.getText());
            String Name = txtName.getText();
            String Blood = txtBlood.getText();
            String Address = txtAddress.getText();
            String Contact = txtContact.getText();
            String EmContact = txtEmContact.getText();
            String Email = txtEmail.getText();
            
            SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
            String DoB = dateForm.format(DateChooser.getDate());
            
            if(verifyText()) {
                try {
                    Connection con = AllConnection.getConnection();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO `patient_info`(`PatientID`, `Name`, `DoB`, `BloodGroup`, `Address`, `ContactNo`, `EmContact`, `Email`) "
                            + "VALUES (?,?,?,?,?,?,?,?)");

                    ps.setInt(1, ID);
                    ps.setString(2, Name);
                    ps.setString(3, DoB);
                    ps.setString(4, Blood);
                    ps.setString(5, Address);
                    ps.setString(6, Contact);
                    ps.setString(7, EmContact);
                    ps.setString(8, Email);

                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "New patient data added");
                        refreshJtable();
                    } else {
                        JOptionPane.showMessageDialog(null, "New patient data not added");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
            
            
        } 
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error in save");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed

    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No data selected");
        } else {
            int id = Integer.parseInt(txtID.getText());
            int x = JOptionPane.showConfirmDialog(null, "Selected data will be deleted", "Delete informantion", JOptionPane.OK_CANCEL_OPTION, 0);
            if (x == JOptionPane.OK_OPTION) {
                try {
                    Connection con = AllConnection.getConnection();
                    PreparedStatement ps = con.prepareStatement("DELETE FROM `patient_info` WHERE PatientID = ?");
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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            int ID = Integer.valueOf(txtID.getText());
            String Name = txtName.getText();
            
            SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
            String Date = dateForm.format(DateChooser.getDate());
            
            String Blood = txtBlood.getText();
            String Address = txtAddress.getText();
            String Contact = txtContact.getText();
            String EmContact = txtEmContact.getText();
            String Email = txtEmail.getText();

            if(verifyText()) {
                Connection con = AllConnection.getConnection();
                try {
                    PreparedStatement ps = con.prepareStatement("UPDATE `patient_info` SET `Name`=?,`DoB`=?,`BloodGroup`=?,`Address`=?,`ContactNo`=?,`EmContact`=?,`Email`=? WHERE `PatientID`=?");
                        
                    ps.setInt(8, ID);
                    ps.setString(1, Name);
                    ps.setString(2, Date);
                    ps.setString(3, Blood);
                    ps.setString(4, Address);
                    ps.setString(5, Contact);
                    ps.setString(6, EmContact);
                    ps.setString(7, Email);

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

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
//        table.setShowGrid(true);

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            if(txtSearch.getText().equals("")) {
                fillClassJtable(table);
                return;
            }
        Connection con = AllConnection.getConnection();
        try {
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM `patient_info` WHERE CONCAT(\"PatientID\", \"Name\", \"DoB\", \"BloodGroup\", \"Address\", \"ContactNo\", \"EmContact\", \"Email\") LIKE ?");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM `patient_info` WHERE PatientID= ?");
            int valueToSearch = Integer.valueOf(txtSearch.getText());
            ps.setInt(1, valueToSearch);
            
            ResultSet rs = ps.executeQuery();

            Object[] row;
            while (rs.next()) {
                row = new Object[8];
                
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);

                model.addRow(row);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "problem happening");
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }
    }//GEN-LAST:event_SearchActionPerformed

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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JLabel LtxtClass;
    private javax.swing.JLabel LtxtSection;
    private javax.swing.JLabel LtxtStudent;
    private javax.swing.JLabel LtxtSubject;
    private javax.swing.JLabel LtxtTeacher;
    private javax.swing.JButton Search;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClearAllFields;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBlood;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
