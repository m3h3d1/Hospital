
import javax.swing.JFrame;

public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form ManuClass
     */
    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnStudent = new javax.swing.JButton();
        btnResult = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        btnAttendance = new javax.swing.JButton();
        btnTeacher1 = new javax.swing.JButton();
        btnTeacher2 = new javax.swing.JButton();
        btnTeacher3 = new javax.swing.JButton();
        btnTeacher4 = new javax.swing.JButton();
        btnTeacher5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 155, 55));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  Hospital Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 710, 150));

        btnStudent.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        btnStudent.setText("Patient Information");
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        jPanel1.add(btnStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 340, 120));

        btnResult.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btnResult.setText("Payment");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });
        jPanel1.add(btnResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, 340, 110));

        welcome.setBackground(new java.awt.Color(255, 255, 255));
        welcome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        welcome.setText("Welcome ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 51, 330, -1));

        btnAttendance.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btnAttendance.setText("Schedule");
        btnAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttendanceActionPerformed(evt);
            }
        });
        jPanel1.add(btnAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 340, 120));

        btnTeacher1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btnTeacher1.setText("Patient History");
        btnTeacher1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacher1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTeacher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 340, 110));

        btnTeacher2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btnTeacher2.setText("Room Information");
        btnTeacher2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacher2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTeacher2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 340, 110));

        btnTeacher3.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btnTeacher3.setText("Doctor Information");
        btnTeacher3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacher3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTeacher3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 340, 110));

        btnTeacher4.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btnTeacher4.setText("Department");
        btnTeacher4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacher4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTeacher4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 340, 110));

        btnTeacher5.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btnTeacher5.setText("Patient Admission");
        btnTeacher5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacher5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTeacher5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 340, 110));

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        Payment form = new Payment();
        form.setVisible(true);
        dispose();
        form.setResizable(false);
    }//GEN-LAST:event_btnResultActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed

        Patient form = new Patient();
        form.setVisible(true);
        form.setResizable(false);
        dispose();

    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttendanceActionPerformed

        Schedule form = new Schedule();
        form.setVisible(true);
        dispose();
        form.setResizable(false);


    }//GEN-LAST:event_btnAttendanceActionPerformed

    private void btnTeacher1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacher1ActionPerformed
        PatientHistory form = new PatientHistory();
        form.setVisible(true);
        dispose();
        form.setResizable(false);
    }//GEN-LAST:event_btnTeacher1ActionPerformed

    private void btnTeacher2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacher2ActionPerformed
        room form = new room();
        form.setVisible(true);
        dispose();
        form.setResizable(false);
    }//GEN-LAST:event_btnTeacher2ActionPerformed

    private void btnTeacher3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacher3ActionPerformed
        Doctor form = new Doctor();
        form.setVisible(true);
        dispose();
        form.setResizable(false);
    }//GEN-LAST:event_btnTeacher3ActionPerformed

    private void btnTeacher4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacher4ActionPerformed
        AddDepartment form = new AddDepartment();
        form.setVisible(true);
        dispose();
        form.setResizable(false);
    }//GEN-LAST:event_btnTeacher4ActionPerformed

    private void btnTeacher5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacher5ActionPerformed
        Admission form = new Admission();
        form.setVisible(true);
        dispose();
        form.setResizable(false);
    }//GEN-LAST:event_btnTeacher5ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttendance;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnTeacher1;
    private javax.swing.JButton btnTeacher2;
    private javax.swing.JButton btnTeacher3;
    private javax.swing.JButton btnTeacher4;
    private javax.swing.JButton btnTeacher5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
