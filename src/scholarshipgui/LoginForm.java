/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarshipgui;

import admin.adminDashboard;
import applicant.applicantDashboard;
import config.dbConnect;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import scholarcommitte.sDashBoard;

/**
 *
 * @author user
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        this.viewicon.setVisible(false);
    }
    
    static String status1;
    static String type1;
    public static boolean loginAccount(String username, String password){
        dbConnect db = new dbConnect();
        try{
            String query = "SELECT * FROM tbl_user WHERE username = '"+ username +"' AND pass = '"+password+"'";
            ResultSet resultSet = db.getData(query);
           
            if(resultSet.next()){
              
                status1 = resultSet.getString("status"); 
                type1 = resultSet.getString("type");
                 
                  return true;
            }else{
                return false; 
            }
        }catch(SQLException e){
           
            return false;
        }
        
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
        RegisterLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        username1 = new javax.swing.JTextField();
        lgnav1 = new javax.swing.JPanel();
        lgnav = new javax.swing.JLabel();
        lgnav2 = new javax.swing.JPanel();
        lgnav3 = new javax.swing.JLabel();
        iconhide = new javax.swing.JLabel();
        viewicon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        passworduser = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegisterLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RegisterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterLabel.setText("No account? Click here to Register");
        RegisterLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterLabelMouseClicked(evt);
            }
        });
        jPanel2.add(RegisterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 320, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("User Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 230, 40));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 110, 30));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/saceeee.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setText("User Name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userlogin.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 30));

        username1.setBackground(new java.awt.Color(204, 204, 204));
        username1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        username1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        username1.setName(""); // NOI18N
        username1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                username1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                username1FocusLost(evt);
            }
        });
        username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username1ActionPerformed(evt);
            }
        });
        jPanel2.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 420, 50));
        username1.getAccessibleContext().setAccessibleName("");

        lgnav1.setBackground(new java.awt.Color(255, 255, 255));
        lgnav1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lgnav1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lgnav1MouseExited(evt);
            }
        });
        lgnav1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lgnav.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lgnav.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lgnav.setText("LOGIN");
        lgnav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lgnavMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lgnavMouseEntered(evt);
            }
        });
        lgnav1.add(lgnav, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 20));

        lgnav2.setBackground(new java.awt.Color(204, 255, 255));
        lgnav2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lgnav2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lgnav2MouseExited(evt);
            }
        });
        lgnav2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lgnav3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lgnav3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lgnav3.setText("LOGIN");
        lgnav3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lgnav3MouseEntered(evt);
            }
        });
        lgnav2.add(lgnav3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 20));

        lgnav1.add(lgnav2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 150, 40));

        jPanel2.add(lgnav1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 150, 40));

        iconhide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconhide.png"))); // NOI18N
        iconhide.setText("jLabel1");
        iconhide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconhideMousePressed(evt);
            }
        });
        jPanel2.add(iconhide, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 30, 30));

        viewicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewicon.png"))); // NOI18N
        viewicon.setText("jLabel1");
        viewicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewiconMousePressed(evt);
            }
        });
        jPanel2.add(viewicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lock.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 30));

        passworduser.setBackground(new java.awt.Color(204, 204, 204));
        passworduser.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        passworduser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passworduser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        passworduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passworduserActionPerformed(evt);
            }
        });
        jPanel2.add(passworduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 420, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 470, 560));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("HUB");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 280, 70));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 102));
        jLabel7.setText("SCHOLARSHIP");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 430, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Welcome Back!");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 280, 40));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconforsholarship.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 290, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passworduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passworduserActionPerformed
       passworduser.setEchoChar('•');
    }//GEN-LAST:event_passworduserActionPerformed

    private void username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username1ActionPerformed

    private void RegisterLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterLabelMouseClicked
        
            RegisterForm rf = new RegisterForm();
           rf.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_RegisterLabelMouseClicked

    private void lgnavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgnavMouseEntered
       
      
    }//GEN-LAST:event_lgnavMouseEntered

    private void lgnav1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgnav1MouseEntered
         lgnav1.setBackground(defaultcolor);
    }//GEN-LAST:event_lgnav1MouseEntered

    private void lgnav1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgnav1MouseExited
        lgnav1.setBackground(hover);
    }//GEN-LAST:event_lgnav1MouseExited

    private void lgnav3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgnav3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lgnav3MouseEntered

    private void lgnav2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgnav2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lgnav2MouseEntered

    private void lgnav2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgnav2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lgnav2MouseExited

    private void iconhideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconhideMousePressed
      iconhide.setVisible(false);
        viewicon.setVisible(true);
        passworduser.setEchoChar((char)0);
    }//GEN-LAST:event_iconhideMousePressed

    private void viewiconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewiconMousePressed
      
         viewicon.setVisible(false);
        iconhide.setVisible(true);
        passworduser.setEchoChar('•');
         
    }//GEN-LAST:event_viewiconMousePressed

    private void username1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username1FocusGained
      
    }//GEN-LAST:event_username1FocusGained

    private void username1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username1FocusLost
       
    }//GEN-LAST:event_username1FocusLost

    private void lgnavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgnavMouseClicked
      
        
       if (username1.getText().isEmpty() && passworduser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username and password cannot be empty.", "Missing Credentials", JOptionPane.WARNING_MESSAGE);
        } else if (username1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your username.", "Missing Username", JOptionPane.WARNING_MESSAGE);
        } else if (passworduser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your password.", "Missing Password", JOptionPane.WARNING_MESSAGE);
        } else {
            if (loginAccount(username1.getText(), passworduser.getText())) {
                if (!status1.equals("Active")) {
                    JOptionPane.showMessageDialog(null, "Pending Account, Please wait for Approval");
                } else {
            JOptionPane.showMessageDialog(null, "Login successful! Redirecting to your dashboard...", 
                              "Login Success", JOptionPane.INFORMATION_MESSAGE);
                        try {
                            Thread.sleep(1500); // 1.5-second delay
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
            if (type1.equals("Admin")) {
                adminDashboard ad = new adminDashboard();
                ad.setVisible(true);
                this.dispose();
            } else if (type1.equals("Applicant")) {
                applicantDashboard ad = new applicantDashboard();
                ad.setVisible(true);
                this.dispose();
            } else if (type1.equals("Scholarship Providers/Committee")) {
                sDashBoard sb = new sDashBoard();
                sb.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No account type found!");
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Invalid Account, Please Register!", "Login Failed", JOptionPane.ERROR_MESSAGE);
    }
}

    }//GEN-LAST:event_lgnavMouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegisterLabel;
    private javax.swing.JLabel iconhide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lgnav;
    private javax.swing.JPanel lgnav1;
    private javax.swing.JPanel lgnav2;
    private javax.swing.JLabel lgnav3;
    private javax.swing.JPasswordField passworduser;
    private javax.swing.JTextField username1;
    private javax.swing.JLabel viewicon;
    // End of variables declaration//GEN-END:variables
}
