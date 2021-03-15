
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mehedi Hasan
 */
public class Department extends javax.swing.JFrame {

    /**
     * Creates new form Department
     */
    public Department() {
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
        txtHead.setText("");
        txtContact.setText("");
        
        table.getSelectionModel().clearSelection();
    }
    
    public void fillClassJtable(JTable table) {
        Connection con = AllConnection.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM `department`");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] row;
            while (rs.next()) {

                row = new Object[4];

                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);

                model.addRow(row);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "problem happening");
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHead = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClearAllFields = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hospital Management System");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 620, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Department");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 230, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 710, 120));

        table.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dept ID", "Name", "Head", "Contact"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 760, 450));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 248, 31));

        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 69, 31));

        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 69, 29));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 248, 29));

        jLabel4.setText("Head");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 69, 33));

        txtHead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeadActionPerformed(evt);
            }
        });
        jPanel1.add(txtHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 248, 29));

        jLabel7.setText("Contact");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 69, 31));

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        jPanel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 248, 31));

        btnAdd.setText("Add New Data");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 153, 47));

        btnClearAllFields.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClearAllFields.setText("Clear Text Fields");
        btnClearAllFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllFieldsActionPerformed(evt);
            }
        });
        jPanel1.add(btnClearAllFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 150, 50));

        btnUpdate.setText("Update Existing Data");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 160, 50));

        btnRemove.setText("Remove Data");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 160, 50));

        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMenu.setText("Back");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed

    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtHeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeadActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    public boolean verifyText() {
        if (txtID.getText().equals("") || txtName.getText().equals("") || txtHead.getText().equals("") || txtContact.getText().equals("")) {
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
            String Head = txtHead.getText();
            String Contact = txtContact.getText();
            if(verifyText()) {
                Connection con = AllConnection.getConnection();
                try {
                    PreparedStatement ps = con.prepareStatement("INSERT INTO `department`(`DeptID`, `Name`, `Head`, `Contact`) "
                        + "VALUES (?,?,?,?)");

                    ps.setInt(1, ID);
                    ps.setString(2, Name);
                    ps.setString(3, Head);
                    ps.setString(4, Contact);

                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "New department data added");
                    } else {
                        JOptionPane.showMessageDialog(null, "New department data not added");
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

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowIndex = table.getSelectedRow();
        try {
            txtID.setText(model.getValueAt(rowIndex, 0).toString());
            txtName.setText(model.getValueAt(rowIndex, 1).toString());
            txtHead.setText(model.getValueAt(rowIndex, 2).toString());
            txtContact.setText(model.getValueAt(rowIndex, 3).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void btnClearAllFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllFieldsActionPerformed
        clearFields();
    }//GEN-LAST:event_btnClearAllFieldsActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            int ID = Integer.valueOf(txtID.getText());
            String Name = txtName.getText();
            String Contact = txtContact.getText();
            String Head = txtHead.getText();

            if(verifyText()) {
                Connection con = AllConnection.getConnection();
                try {
                    PreparedStatement ps = con.prepareStatement("UPDATE `department` SET `Name`=?,`Contact`=?,`Head`=? WHERE `DeptID`=?");

                    ps.setInt(4, ID);
                    ps.setString(1, Name);
                    ps.setString(2, Contact);
                    ps.setString(3, Head);

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

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No data selected");
        } else {
            int id = Integer.parseInt(txtID.getText());
            int x = JOptionPane.showConfirmDialog(null, "Selected data will be deleted", "Delete informantion", JOptionPane.OK_CANCEL_OPTION, 0);
            if (x == JOptionPane.OK_OPTION) {
                try {
                    Connection con = AllConnection.getConnection();
                    PreparedStatement ps = con.prepareStatement("DELETE FROM `department` WHERE DeptID = ?");
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

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        MainMenu form = new MainMenu();
        form.setVisible(true);
        dispose();
        form.setResizable(false);
    }//GEN-LAST:event_btnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Department().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClearAllFields;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtHead;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
