
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Doctor extends javax.swing.JFrame {

    DefaultTableModel model;
//    StudentFunction sf;
//    TeacherFunction tf;

    public Doctor() {
        initComponents();
        fillClassJtable(table);
        table.setRowHeight(40);
        table.setShowGrid(true);
    }

    public void fillClassJtable(JTable table) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = AllConnection.getConnection();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `patient_info`");

            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] row;
            while (rs.next()) {
                row = new Object[6];

                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getInt(4);
                row[4] = rs.getString(5);

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
        label1 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        txtName = new java.awt.TextField();
        txtTeacher = new java.awt.TextField();
        txtSubject = new java.awt.TextField();
        txtStudent = new java.awt.TextField();
        txtSection = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnMenu = new javax.swing.JButton();
        btnMenu1 = new javax.swing.JButton();
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
        jLabel6.setText("Patient Information");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
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

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 810, 150));

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Section");
        jPanel5.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, -1, -1));

        label3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Class Name");
        jPanel5.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        label4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("Class Teacher's Name");
        jPanel5.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        label5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 0));
        label5.setText("Total Subject");
        jPanel5.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        label6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 0));
        label6.setText("Total Student");
        jPanel5.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));

        txtName.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jPanel5.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 270, 50));

        txtTeacher.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jPanel5.add(txtTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 270, 50));

        txtSubject.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jPanel5.add(txtSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 270, 50));

        txtStudent.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jPanel5.add(txtStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 270, 50));

        txtSection.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtSection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Science", "Arts", "Commerce" }));
        jPanel5.add(txtSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 270, 50));

        table.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class", "Teacher", "Total Subject", "Total Student", "Section"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 740, 480));

        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMenu.setText("Add New Patient");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel5.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, 220, 50));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 730, 150, 50));

        btnMenu1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMenu1.setText("Home");
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 730, -1, 50));

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        model = (DefaultTableModel) table.getModel();
        int rowIndex = table.getSelectedRow();
        try {
            txtName.setText(model.getValueAt(rowIndex, 0).toString());
            txtTeacher.setText(model.getValueAt(rowIndex, 1).toString());
            txtSubject.setText(model.getValueAt(rowIndex, 2).toString());
            txtStudent.setText(model.getValueAt(rowIndex, 3).toString());
            txtSection.setSelectedItem(model.getValueAt(rowIndex, 4).toString());

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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Integer class_id = null;
        try {
            class_id = Integer.parseInt(txtName.getText());

        } catch (NumberFormatException e) {
            /// JOptionPane.showMessageDialog(null,e);
        }

        String tname = txtTeacher.getText();
        Integer total_subject = Integer.parseInt(txtSubject.getText());
        Integer total_student = Integer.parseInt(txtStudent.getText());
        String section = (String) txtSection.getSelectedItem();
        if (verifyText()) {
            Connection con = AllConnection.getConnection();
            PreparedStatement ps;
            try {
                ps = con.prepareStatement("UPDATE `patient_info` SET `teacher`=?,`subject`=?,`student`=?,`section`=? WHERE `class` =?");

                ps.setString(1, tname);
                ps.setInt(2, total_subject);
                ps.setInt(3, total_student);
                ps.setString(4, section);
                ps.setInt(5, class_id);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Class data updated");
                } else {
                    JOptionPane.showMessageDialog(null, "new class data not added");
                }
            } catch (SQLException ex) {
            }
        }
        table.setModel(new DefaultTableModel(null, new Object[]{"class", "teacher", "Total subject", "Total Student", "Section"}));
        fillClassJtable(table);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenu1ActionPerformed

    public boolean verifyText() {

        if (txtName.getText().equals("") || txtTeacher.getText().equals("") || txtSubject.getText().equals("") || txtStudent.getText().equals("") || txtSection.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "one or more emtry field");
            return false;
        } else {
            return true;
        }

    }

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenu1;
    public static final javax.swing.JButton btnUpdate = new javax.swing.JButton();
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JTable table;
    private java.awt.TextField txtName;
    private javax.swing.JComboBox<String> txtSection;
    private java.awt.TextField txtStudent;
    private java.awt.TextField txtSubject;
    private java.awt.TextField txtTeacher;
    // End of variables declaration//GEN-END:variables
}
