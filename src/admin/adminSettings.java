/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.Session;
import java.awt.Color;
import javax.swing.JOptionPane;
import scholarshipgui.LoginForm;

/**
 *
 * @author user
 */
public class adminSettings extends javax.swing.JFrame {

    /**
     * Creates new form adminSettings
     */
    public adminSettings() {
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
        changemail = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        changepass = new javax.swing.JPanel();
        edit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Email1 = new javax.swing.JLabel();
        Email2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Email3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        fname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        email = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        contact = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        password = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        back1 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        changemail.setBackground(new java.awt.Color(255, 255, 255));
        changemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changemailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changemailMouseExited(evt);
            }
        });
        changemail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setText("Change Email");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        changemail.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 30));

        jPanel2.add(changemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 240, 50));

        changepass.setBackground(new java.awt.Color(255, 255, 255));
        changepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changepassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changepassMouseExited(evt);
            }
        });
        changepass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edit.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit.setText("Change Password");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        changepass.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 200, 30));

        jPanel2.add(changepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 260, 50));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Personal Info");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setText("__________________________________________________________________________________________________________________________________");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, -1, 40));

        Email.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Email.setText("Password:");
        jPanel2.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, 40));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("Name:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 70, 40));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("Username: ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, 40));

        Email1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Email1.setText("Email:");
        jPanel2.add(Email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 90, 40));

        Email2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Email2.setText("Current User ID: ");
        jPanel2.add(Email2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 130, 50));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settingspic.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 290, 260));

        Email3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Email3.setText("Contact:");
        jPanel2.add(Email3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 90, 40));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fname.setText("Fname");
        jPanel3.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 50));

        lname.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lname.setText("Lname");
        jPanel3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 140, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 350, 50));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("Username");
        jPanel4.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 200, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 350, 50));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("Email@gmal.com");
        jPanel5.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 350, 50));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contact.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contact.setText("Contact#");
        jPanel6.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 200, 30));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 350, 50));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password.setText("UserPassword");
        jPanel7.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 30));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 350, 50));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("User_id");
        jPanel8.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 30));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 200, 50));

        back1.setBackground(new java.awt.Color(255, 255, 255));
        back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                back1MouseExited(evt);
            }
        });
        back1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        back.setText(" Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 30));

        jPanel2.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 200, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 930, 610));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PERSONAL INFORMATION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 770, 50));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pi.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 110, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
      
    }//GEN-LAST:event_deleteMouseClicked

    private void changemailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changemailMouseEntered
        changemail.setBackground(defaultcolor);
    }//GEN-LAST:event_changemailMouseEntered

    private void changemailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changemailMouseExited
        changemail.setBackground(hover);
    }//GEN-LAST:event_changemailMouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        
    }//GEN-LAST:event_editMouseClicked

    private void changepassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseEntered
        changepass.setBackground(defaultcolor);
    }//GEN-LAST:event_changepassMouseEntered

    private void changepassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseExited
        changepass.setBackground(hover);
    }//GEN-LAST:event_changepassMouseExited

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     Session sess = Session.getInstance();
        
        if(sess.getUser_id() == 0){
            JOptionPane.showMessageDialog(null, "No account, Please Login First", "Missing Account", JOptionPane.WARNING_MESSAGE);
            LoginForm lf = new LoginForm();
            lf.setVisible(true);
            this.dispose();
     }
    fname.setText(""+sess.getFname());
       lname.setText(""+sess.getLname());
       username.setText(""+sess.getUsername());
        email.setText(""+sess.getEmail());
         contact.setText(""+sess.getContact());
           password.setText(""+sess.getPassword());
             id.setText(""+sess.getUser_id());
    
    }//GEN-LAST:event_formWindowActivated

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       adminDashboard ad = new adminDashboard();
       ad.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void back1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseEntered
       back1.setBackground(defaultcolor);
    }//GEN-LAST:event_back1MouseEntered

    private void back1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseExited
        back1.setBackground(hover);
    }//GEN-LAST:event_back1MouseExited

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
            java.util.logging.Logger.getLogger(adminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Email1;
    private javax.swing.JLabel Email2;
    private javax.swing.JLabel Email3;
    private javax.swing.JLabel back;
    private javax.swing.JPanel back1;
    private javax.swing.JPanel changemail;
    private javax.swing.JPanel changepass;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel password;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
