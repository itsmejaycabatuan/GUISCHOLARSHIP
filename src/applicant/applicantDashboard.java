/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicant;

import java.awt.Color;
import javax.swing.JOptionPane;
import scholarshipgui.LoginForm;

/**
 *
 * @author user
 */
public class applicantDashboard extends javax.swing.JFrame {

    /**
     * Creates new form userDashboard
     */
    public applicantDashboard() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logoutnav = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        scholarnav1 = new javax.swing.JPanel();
        labelscholar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        paneldashboard = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        panelset = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        usersnav = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("_____________________________________");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 280, 20));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/applicantuser.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 130, 110));

        logoutnav.setBackground(new java.awt.Color(255, 255, 255));
        logoutnav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutnavMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutnavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutnavMouseExited(evt);
            }
        });
        logoutnav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("jLabel5");
        logoutnav.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        logout.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoutfordashboard.png"))); // NOI18N
        logout.setText("  Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logoutnav.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, 30));

        jPanel2.add(logoutnav, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 270, 50));

        scholarnav1.setBackground(new java.awt.Color(255, 255, 255));
        scholarnav1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scholarnav1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                scholarnav1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                scholarnav1MouseExited(evt);
            }
        });
        scholarnav1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelscholar.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        labelscholar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdashboard.png"))); // NOI18N
        labelscholar.setText(" Apply Scholarships");
        labelscholar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelscholarMouseClicked(evt);
            }
        });
        scholarnav1.add(labelscholar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 210, 30));

        jPanel2.add(scholarnav1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 260, 50));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hello, Applicant");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 190, 20));

        paneldashboard.setBackground(new java.awt.Color(255, 255, 255));
        paneldashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paneldashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paneldashboardMouseExited(evt);
            }
        });
        paneldashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard.png"))); // NOI18N
        jLabel11.setText(" Home");
        paneldashboard.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 13, 151, -1));

        jPanel2.add(paneldashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 260, 50));

        panelset.setBackground(new java.awt.Color(255, 255, 255));
        panelset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelsetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelsetMouseExited(evt);
            }
        });
        panelset.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings.png"))); // NOI18N
        jLabel9.setText(" Settings");
        panelset.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, 29));

        jPanel2.add(panelset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 280, 50));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        usersnav.setBackground(new java.awt.Color(255, 255, 255));
        usersnav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersnavMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersnavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersnavMouseExited(evt);
            }
        });
        usersnav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("jLabel5");
        usersnav.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userdashboardlogo.png"))); // NOI18N
        jLabel6.setText("  Applicants");
        usersnav.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 150, 30));

        jPanel2.add(usersnav, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 680));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 3));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/total.png"))); // NOI18N
        jLabel22.setText(" Total User");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 180, 70));

        jLabel23.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel23.setText("0");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 50, 80));

        jLabel24.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel24.setText("Registered Users");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 160, 50));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 270, 220));

        jLabel28.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/finalsib.png"))); // NOI18N
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 70));

        jLabel25.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel25.setText("0");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 70, 80));

        jLabel26.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Submitted");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 50));

        jLabel33.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Total Application");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 190, 50));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 230, 220));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("APPLICANT DASHBOARD");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 800, 100));

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 950, 270));

        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Recent Application Submission");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 250, 50));

        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Overview");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 140, 50));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 102), 3, true));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pendingapplication.png"))); // NOI18N
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 130, 60));

        jLabel27.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel27.setText("0");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 80, 100));

        jLabel29.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Pending Application");
        jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, 70));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 220, 220));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 3));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/approve.png"))); // NOI18N
        jPanel12.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, 60));

        jLabel31.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel31.setText("0");
        jPanel12.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 70, 70));

        jLabel32.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Approved Application");
        jPanel12.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, 70));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 220, 220));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 3));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reject.png"))); // NOI18N
        jPanel13.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 80, 60));

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel20.setText("0");
        jPanel13.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 70, 70));

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Rejected Application");
        jPanel13.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, 70));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 150, 220, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1341, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usersnavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersnavMouseExited
        usersnav.setBackground(hover);
    }//GEN-LAST:event_usersnavMouseExited

    private void usersnavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersnavMouseEntered
        usersnav.setBackground(defaultcolor);
    }//GEN-LAST:event_usersnavMouseEntered

    private void usersnavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersnavMouseClicked

    }//GEN-LAST:event_usersnavMouseClicked

    private void panelsetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelsetMouseExited
        panelset.setBackground(hover);
    }//GEN-LAST:event_panelsetMouseExited

    private void panelsetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelsetMouseEntered
        panelset.setBackground(defaultcolor);
    }//GEN-LAST:event_panelsetMouseEntered

    private void paneldashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneldashboardMouseExited
        paneldashboard.setBackground(hover);
    }//GEN-LAST:event_paneldashboardMouseExited

    private void paneldashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneldashboardMouseEntered
        paneldashboard.setBackground(defaultcolor);
    }//GEN-LAST:event_paneldashboardMouseEntered

    private void scholarnav1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scholarnav1MouseExited
        scholarnav1.setBackground(hover);
    }//GEN-LAST:event_scholarnav1MouseExited

    private void scholarnav1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scholarnav1MouseEntered
        scholarnav1.setBackground(defaultcolor);
    }//GEN-LAST:event_scholarnav1MouseEntered

    private void scholarnav1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scholarnav1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_scholarnav1MouseClicked

    private void labelscholarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelscholarMouseClicked
        applyScholarship as = new applyScholarship();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelscholarMouseClicked

    private void logoutnavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutnavMouseExited
        logoutnav.setBackground(hover);
    }//GEN-LAST:event_logoutnavMouseExited

    private void logoutnavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutnavMouseEntered
        logoutnav.setBackground(defaultcolor);
    }//GEN-LAST:event_logoutnavMouseEntered

    private void logoutnavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutnavMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutnavMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to log out?", "Logout Confirmation!",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (choice == JOptionPane.YES_OPTION) {

            LoginForm lf = new LoginForm();
            lf.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(applicantDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(applicantDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(applicantDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(applicantDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new applicantDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelscholar;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel logoutnav;
    private javax.swing.JPanel paneldashboard;
    private javax.swing.JPanel panelset;
    private javax.swing.JPanel scholarnav1;
    private javax.swing.JPanel usersnav;
    // End of variables declaration//GEN-END:variables
}
