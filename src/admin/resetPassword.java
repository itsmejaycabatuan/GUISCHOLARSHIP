/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnect;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import scholarshipgui.LoginForm;

/**
 *
 * @author user
 */
public class resetPassword extends javax.swing.JFrame {
private int userId; // Store user ID
    /**
     * Creates new form resetPassword
     */
    public resetPassword(int userId) {
      
        initComponents();
        this.userId = userId;
       
    }
Color hover = new Color (255,255,255);
    Color defaultcolor = new Color  (102,102,102);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        resetpass = new javax.swing.JTextField();
        back2 = new javax.swing.JPanel();
        save = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Change Password");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setText("_______________________________________________________________________________");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 40));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("New Password:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 40));

        resetpass.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        resetpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resetpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        resetpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetpassActionPerformed(evt);
            }
        });
        jPanel2.add(resetpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 410, 60));

        back2.setBackground(new java.awt.Color(255, 255, 255));
        back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                back2MouseExited(evt);
            }
        });
        back2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        save.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save.setText("SAVE CHANGES");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        back2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 30));

        jPanel2.add(back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 220, 50));

        back.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        back.setText(" Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 590, 270));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pi.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 80, 70));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PERSONAL INFORMATION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 440, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetpassActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
       
        
        int userId = this.userId; // Make sure userId is stored in the class

       
       String newPasswordText = resetpass.getText().trim();

    if (newPasswordText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "New password is required!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Hash the new password
        String hashedPassword = passwordHasher.hashPassword(newPasswordText);

        // Database connection
        dbConnect dc = new dbConnect();
        Connection con = dc.getConnection();

        // Update query
        String updateQuery = "UPDATE tbl_user SET pass = ? WHERE u_id = ?";
        PreparedStatement pst = con.prepareStatement(updateQuery);
        pst.setString(1, hashedPassword);
        pst.setInt(2, userId); 

        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Password updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            LoginForm lf = new LoginForm();
            lf.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Password update failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Close resources
        pst.close();
        con.close();

    } catch (SQLException  | NoSuchAlgorithmException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error!", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_saveMouseClicked

    private void back2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back2MouseEntered
        back2.setBackground(defaultcolor);
    }//GEN-LAST:event_back2MouseEntered

    private void back2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back2MouseExited
        back2.setBackground(hover);
    }//GEN-LAST:event_back2MouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       entermail em = new entermail();
       em.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back2MouseClicked
       
    }//GEN-LAST:event_back2MouseClicked

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
            java.util.logging.Logger.getLogger(resetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resetPassword(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel back2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField resetpass;
    private javax.swing.JLabel save;
    // End of variables declaration//GEN-END:variables
}
