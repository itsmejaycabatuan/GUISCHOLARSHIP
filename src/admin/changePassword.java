/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.Session;
import config.dbConnect;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class changePassword extends javax.swing.JFrame {

    /**
     * Creates new form changePassword
     */
    public changePassword() {
        initComponents();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        newpass = new javax.swing.JTextField();
        CurrentPass = new javax.swing.JTextField();
        back2 = new javax.swing.JPanel();
        back3 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        Email2 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

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

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("Current Pass: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 40));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("New Password:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, 40));

        newpass.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        newpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        newpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassActionPerformed(evt);
            }
        });
        jPanel2.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 410, 60));

        CurrentPass.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        CurrentPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CurrentPass.setText("Current_pass");
        CurrentPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        CurrentPass.setEnabled(false);
        CurrentPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentPassActionPerformed(evt);
            }
        });
        jPanel2.add(CurrentPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 410, 60));

        back2.setBackground(new java.awt.Color(255, 255, 255));
        back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                back2MouseExited(evt);
            }
        });
        back2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        back3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back3.setText("UPDATE");
        back3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back3MouseClicked(evt);
            }
        });
        back2.add(back3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 110, 30));

        jPanel2.add(back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 190, 50));

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

        Email2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Email2.setText("Current User ID: ");
        jPanel2.add(Email2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, 40));

        id.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("User_id");
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 410, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 590, 400));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassActionPerformed

    private void CurrentPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CurrentPassActionPerformed

    private void back3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back3MouseClicked
try {
    if (CurrentPass.getText().isEmpty() || newpass.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "All Fields Required!", "Missing Information", JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (newpass.getText().length() < 8) {
        JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!", "Invalid Password", JOptionPane.WARNING_MESSAGE);
        return;
    }

    dbConnect dc = new dbConnect();
    Connection con = dc.getConnection();

    
    String hashedNewPass = passwordHasher.hashPassword(newpass.getText());

    // Update password in the database
    String updateQuery = "UPDATE tbl_user SET pass = ? WHERE u_id = ?";
    PreparedStatement updateStmt = con.prepareStatement(updateQuery);
    updateStmt.setString(1, hashedNewPass); // Store hashed password
    updateStmt.setInt(2, Session.getInstance().getUser_id());

    int updatedRows = updateStmt.executeUpdate();
    if (updatedRows > 0) {
        JOptionPane.showMessageDialog(null, "Password updated successfully!");

        // This part is auto update para session
        Session sess = Session.getInstance();
        sess.setPassword(hashedNewPass); // This part is to store the updated password padong sa database

        //This part is refresh
        String fetchQuery = "SELECT * FROM tbl_user WHERE u_id = ?";
        PreparedStatement fetchStmt = con.prepareStatement(fetchQuery);
        fetchStmt.setInt(1, Session.getInstance().getUser_id());
        ResultSet rs = fetchStmt.executeQuery();

        if (rs.next()) {
            sess.setFname(rs.getString("f_name"));
            sess.setLname(rs.getString("l_name"));
            sess.setEmail(rs.getString("email"));
            sess.setUsername(rs.getString("username"));
            sess.setType(rs.getString("type"));
            sess.setStatus(rs.getString("status"));
            sess.setContact(rs.getString("contact"));
        }

     
        adminSettings as = new adminSettings();
        as.setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(null, "Failed to update password!", "Error", JOptionPane.ERROR_MESSAGE);
    }

   
    updateStmt.close();
    con.close();

} catch (SQLException | NoSuchAlgorithmException ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error updating password!", "Error", JOptionPane.ERROR_MESSAGE);
}


    }//GEN-LAST:event_back3MouseClicked

    private void back2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back2MouseEntered
        back2.setBackground(defaultcolor);
    }//GEN-LAST:event_back2MouseEntered

    private void back2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back2MouseExited
        back2.setBackground(hover);
    }//GEN-LAST:event_back2MouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        adminSettings as = new adminSettings();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Session sess = Session.getInstance();
       
         id.setText(""+sess.getUser_id());
  CurrentPass.setText(""+sess.getPassword());
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CurrentPass;
    private javax.swing.JLabel Email2;
    private javax.swing.JLabel back;
    private javax.swing.JPanel back2;
    private javax.swing.JLabel back3;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField newpass;
    // End of variables declaration//GEN-END:variables
}
