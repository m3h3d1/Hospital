
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehedi Hasan
 */
public class AddDoctor extends javax.swing.JFrame {

    /**
     * Creates new form AddDoctor
     */
    public AddDoctor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDesignation = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtWorkingHour = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVisitingFee = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDeptID = new javax.swing.JTextField();
        btnHome = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Salary");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 304, 69, 35));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 465, 153, 47));

        jLabel8.setText("Working Hour");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 345, -1, 34));

        jLabel9.setText("Visiting Fee");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 385, 69, 31));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 134, 248, 31));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 183, 248, 29));

        txtDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesignationActionPerformed(evt);
            }
        });
        getContentPane().add(txtDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 268, 248, 26));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 134, 69, 31));
        getContentPane().add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 305, 248, 28));

        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 183, 69, 29));
        getContentPane().add(txtWorkingHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 344, 248, 29));

        jLabel4.setText("Dept ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 223, 69, 33));
        getContentPane().add(txtVisitingFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 386, 248, 31));

        jLabel6.setText("Designation");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 267, 69, 31));

        txtDeptID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeptIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtDeptID, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 225, 248, 29));

        btnHome.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 461, -1, 47));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Add Doctor");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error in save");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesignationActionPerformed

    private void txtDeptIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeptIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeptIDActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        MainMenu form=new MainMenu();
        form.setVisible(true);
        dispose();
        form.setResizable(false);
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDeptID;
    private javax.swing.JTextField txtDesignation;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtVisitingFee;
    private javax.swing.JTextField txtWorkingHour;
    // End of variables declaration//GEN-END:variables
}