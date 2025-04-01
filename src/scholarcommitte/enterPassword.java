/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarcommitte;
import admin.adminSettings;
import java.awt.Color;

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
public class enterPassword extends javax.swing.JFrame {

    /**
     * Creates new form enterPassword
     */
    public enterPassword() {
        initComponents();
    }
  private void updateEmail() {
    try {
        dbConnect dc = new dbConnect();
        Connection con = dc.getConnection();

      
        String updateQuery = "UPDATE tbl_user SET email = ? WHERE u_id = ?";
        PreparedStatement updatePst = con.prepareStatement(updateQuery);
        updatePst.setString(1, newEmail); 
        updatePst.setInt(2, userID);

        int updatedRows = updatePst.executeUpdate();
        if (updatedRows > 0) {
            JOptionPane.showMessageDialog(null, "Email updated successfully!");

           
            Session sess = Session.getInstance();
            sess.setEmail(newEmail); 

          
            String logQuery = "INSERT INTO tbl_logs (user_id, action, date_time) VALUES (?, ?, NOW())";
            try (PreparedStatement pstmtLog = con.prepareStatement(logQuery)) {
                pstmtLog.setInt(1, userID); 
                pstmtLog.setString(2, "SPC updated email address");
                pstmtLog.executeUpdate();
            }

          
            comsSettings as = new comsSettings();
            as.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Update failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        updatePst.close();
        con.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error updating email!", "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}
Color hover = new Color (255,255,255);
    Color defaultcolor = new Color  (102,102,102);
    public static int userID;
public static String newEmail;
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
        enterpass = new javax.swing.JTextField();
        back2 = new javax.swing.JPanel();
        confirm = new javax.swing.JLabel();
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
        jLabel1.setText("Enter Password");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setText("_______________________________________________________________________________");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 40));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("Enter Password:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 200, -1, 40));

        enterpass.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        enterpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enterpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        enterpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpassActionPerformed(evt);
            }
        });
        jPanel2.add(enterpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 410, 60));

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

        confirm.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        confirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirm.setText("SAVE CHANGES");
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
        });
        back2.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 30));

        jPanel2.add(back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 220, 50));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 590, 340));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enterpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpassActionPerformed

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
        try {
            dbConnect dc = new dbConnect();
            Connection con = dc.getConnection();

            String query = "SELECT pass FROM tbl_user WHERE u_id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, userID);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String storedHashedPassword = rs.getString("pass");

                String enteredPassword = enterpass.getText();

                String hashedEnteredPassword = passwordHasher.hashPassword(enteredPassword);

                if (!hashedEnteredPassword.equals(storedHashedPassword)) {
                    JOptionPane.showMessageDialog(null, "Incorrect Password!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                updateEmail();

                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "User Not Found!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            rs.close();
            pst.close();
            con.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Error!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error hashing password!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_confirmMouseClicked

    private void back2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back2MouseEntered
        back2.setBackground(defaultcolor);
    }//GEN-LAST:event_back2MouseEntered

    private void back2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back2MouseExited
        back2.setBackground(hover);
    }//GEN-LAST:event_back2MouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        changemail ce = new changemail();
        ce.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
 Session sess = Session.getInstance();
       
         id.setText(""+sess.getUser_id());       
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
            java.util.logging.Logger.getLogger(enterPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enterPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enterPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enterPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enterPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email2;
    private javax.swing.JLabel back;
    private javax.swing.JPanel back2;
    private javax.swing.JLabel confirm;
    private javax.swing.JTextField enterpass;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
