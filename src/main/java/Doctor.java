
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
        jLabel6.setText("View Doctors Information");

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
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
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

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1250, 460));

        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMenu.setText("Back");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel5.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, 50));

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

        btnMenu1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMenu1.setText("Add New Doctor");
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, 220, 50));

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            LtxtClass.setText(model.getValueAt(rowIndex, 0).toString());
            LtxtTeacher.setText(model.getValueAt(rowIndex, 1).toString());
            LtxtSubject.setText(model.getValueAt(rowIndex, 2).toString());
            LtxtStudent.setText(model.getValueAt(rowIndex, 3).toString());
            LtxtSection.setText(model.getValueAt(rowIndex, 4).toString());

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

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        AddDoctor form = new AddDoctor();
        form.setVisible(true);
        dispose();
        form.setResizable(false);
    }//GEN-LAST:event_btnMenu1ActionPerformed

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
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}