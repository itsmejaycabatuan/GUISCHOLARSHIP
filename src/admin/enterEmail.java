/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import scholarshipgui.LoginForm;

/**
 *
 * @author user
 */
public class enterEmail extends javax.swing.JFrame {

    /**
     * Creates new form secQuestion
     */
    public enterEmail() {
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
        back2 = new javax.swing.JPanel();
        confirmEmail = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        Email2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Security Questions");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setText("_______________________________________________________________________________");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 40));

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

        confirmEmail.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        confirmEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmEmail.setText("CONFIRM");
        confirmEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmEmailMouseClicked(evt);
            }
        });
        back2.add(confirmEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 110, 30));

        jPanel2.add(back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 190, 50));

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
        Email2.setText("Enter Email:");
        jPanel2.add(Email2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, 40));

        email.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 410, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 590, 280));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
      LoginForm lf = new LoginForm();
      lf.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void back2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back2MouseExited
        back2.setBackground(hover);
    }//GEN-LAST:event_back2MouseExited

    private void back2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back2MouseEntered
        back2.setBackground(defaultcolor);
    }//GEN-LAST:event_back2MouseEntered

    private void confirmEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmEmailMouseClicked
if (email.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Email field is required!", "Missing Information", JOptionPane.WARNING_MESSAGE);
    return;
}

try {
    dbConnect dc = new dbConnect();
    Connection con = dc.getConnection();

    
    String checkQuery = "SELECT u_id, sec_ques1, sec_ques2 FROM tbl_user WHERE email = ?";
    PreparedStatement checkPst = con.prepareStatement(checkQuery);
    checkPst.setString(1, email.getText());
    ResultSet rs = checkPst.executeQuery();

    if (rs.next()) { 
        int userId = rs.getInt("u_id");
        String question1 = rs.getString("sec_ques1");
        String question2 = rs.getString("sec_ques2");

        JOptionPane.showMessageDialog(null, "Email exists. Proceeding to security questions.", "Success", JOptionPane.INFORMATION_MESSAGE);

       
        secQuestion sq = new secQuestion(userId, email.getText(),question1, question2);
        sq.setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(null, "Email not found!", "Error", JOptionPane.ERROR_MESSAGE);
    }

    
    rs.close();
    checkPst.close();
    con.close();
} catch (SQLException ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "Database Error!", "Error", JOptionPane.ERROR_MESSAGE);
}
                
                
                
                
    }//GEN-LAST:event_confirmEmailMouseClicked

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
            java.util.logging.Logger.getLogger(enterEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enterEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enterEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enterEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enterEmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email2;
    private javax.swing.JLabel back;
    private javax.swing.JPanel back2;
    private javax.swing.JLabel confirmEmail;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
