/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarcommitte;

import config.dbConnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class scho_table extends javax.swing.JFrame {

    /**
    
     */
    public scho_table() {
        initComponents();
        displayScholarship();
        searchfield.getDocument().addDocumentListener(new DocumentListener() {
    @Override
    public void insertUpdate(DocumentEvent e) {
        searchTable(); // Call searchTable when text is added
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        searchTable(); // Call searchTable when text is removed
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        searchTable(); // Needed for text formatting changes (rare)
    }
});

    }
    public void displayScholarship(){
        
        try{
            dbConnect db = new dbConnect();
        ResultSet rs = db.getData("SELECT * FROM tbl_scholarship");
        tbl_scholarship1.setModel(DbUtils.resultSetToTableModel(rs));
        rs.close();
        }catch(SQLException e){
            System.out.println("Erros: "+e.getMessage());
        }

    }
    private void searchTable() {
    String searchText = searchfield.getText().toLowerCase().trim(); // Normalize input

    dbConnect db = new dbConnect();
    Connection conn = db.getConnection();

    if (conn == null) {
        JOptionPane.showMessageDialog(this, "Database connection failed. Please check your settings.");
        return;
    }

    String query;
    boolean isSearchEmpty = searchText.isEmpty();

    // ✅ If search field is empty, load all data
    if (isSearchEmpty) {
        query = "SELECT * FROM tbl_scholarship"; // Load all records
    } else {
        query = "SELECT * FROM tbl_scholarship WHERE LOWER(s_name) LIKE ? OR LOWER(status) LIKE ?";
    }

    try (PreparedStatement statement = conn.prepareStatement(query)) {
        if (!isSearchEmpty) { // Only set parameters if searching
            statement.setString(1, "%" + searchText + "%");
            statement.setString(2, "%" + searchText + "%");
        }

        try (ResultSet resultSet = statement.executeQuery()) {
            tbl_scholarship1.setModel(DbUtils.resultSetToTableModel(resultSet));

            if (tbl_scholarship1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No matching records found.");
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error executing query: " + ex.getMessage());
        ex.printStackTrace();
    } finally {
        db.close(); // ✅ Ensure connection is closed
    }
}
    private void loadScholarships() {
    try {
        dbConnect dc = new dbConnect();
        Connection con = dc.getConnection();
        String query = "SELECT * FROM tbl_scholarship";
        PreparedStatement pstmt = con.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();
        
        DefaultTableModel model = (DefaultTableModel) tbl_scholarship1.getModel();
        model.setRowCount(0); // Clear table before loading

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("s_id"),
                rs.getString("s_name"),
                rs.getString("description"),
                rs.getString("GPA"),
                rs.getString("requirements"),
                rs.getInt("annual_income"),
                rs.getInt("fund_amount"),
                rs.getInt("capacity"),
                rs.getString("Deadline"),
                rs.getString("status")
            });
        }

        rs.close();
        pstmt.close();
        con.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error loading scholarships: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usersnav = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        backnav = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        deletenav = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        editnav = new javax.swing.JPanel();
        edit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_scholarship1 = new javax.swing.JTable();
        searchfield = new javax.swing.JTextField();
        searchnav = new javax.swing.JPanel();
        search = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("_____________________________________");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/com.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 130, 110));

        usersnav.setBackground(new java.awt.Color(255, 255, 255));
        usersnav.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addform2.png"))); // NOI18N
        jLabel7.setText(" Add");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        usersnav.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 30));

        jPanel2.add(usersnav, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 240, 50));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconforsholarship.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 260, 260));

        backnav.setBackground(new java.awt.Color(255, 255, 255));
        backnav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backnavMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backnavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backnavMouseExited(evt);
            }
        });
        backnav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jLabel8.setText(" Back");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        backnav.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 30));

        jPanel2.add(backnav, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 240, 50));

        deletenav.setBackground(new java.awt.Color(255, 255, 255));
        deletenav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletenavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletenavMouseExited(evt);
            }
        });
        deletenav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deleteform.png"))); // NOI18N
        delete.setText(" Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        deletenav.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, 30));

        jPanel2.add(deletenav, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 240, 50));

        editnav.setBackground(new java.awt.Color(255, 255, 255));
        editnav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editnavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editnavMouseExited(evt);
            }
        });
        editnav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edit.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editform.png"))); // NOI18N
        edit.setText(" Edit");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        editnav.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 30));

        jPanel2.add(editnav, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 240, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 680));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SCHOLARSHIP'S");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 610, 50));

        tbl_scholarship1.setBackground(new java.awt.Color(153, 153, 153));
        tbl_scholarship1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tbl_scholarship1.setForeground(new java.awt.Color(255, 255, 255));
        tbl_scholarship1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_scholarship1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 860, 520));

        searchfield.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        searchfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        searchfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchfieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchfieldMouseExited(evt);
            }
        });
        searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfieldActionPerformed(evt);
            }
        });
        jPanel1.add(searchfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 750, 40));

        searchnav.setBackground(new java.awt.Color(255, 255, 255));
        searchnav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchnavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchnavMouseExited(evt);
            }
        });
        searchnav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seach.png"))); // NOI18N
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        searchnav.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 40));

        jPanel1.add(searchnav, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 130, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1196, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usersnavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersnavMouseEntered
        usersnav.setBackground(defaultcolor);
    }//GEN-LAST:event_usersnavMouseEntered

    private void usersnavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersnavMouseExited
        usersnav.setBackground(hover);
    }//GEN-LAST:event_usersnavMouseExited

    private void backnavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backnavMouseClicked
       
    }//GEN-LAST:event_backnavMouseClicked

    private void backnavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backnavMouseEntered
        backnav.setBackground(defaultcolor);
    }//GEN-LAST:event_backnavMouseEntered

    private void backnavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backnavMouseExited
        backnav.setBackground(hover);
    }//GEN-LAST:event_backnavMouseExited

    private void deletenavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletenavMouseEntered
        deletenav.setBackground(defaultcolor);
    }//GEN-LAST:event_deletenavMouseEntered

    private void deletenavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletenavMouseExited
        deletenav.setBackground(hover);
    }//GEN-LAST:event_deletenavMouseExited

    private void editnavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editnavMouseEntered
        editnav.setBackground(defaultcolor);
    }//GEN-LAST:event_editnavMouseEntered

    private void editnavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editnavMouseExited
        editnav.setBackground(hover);
    }//GEN-LAST:event_editnavMouseExited

    private void searchfieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchfieldMouseEntered
        searchfield.setBackground(defaultcolor);
    }//GEN-LAST:event_searchfieldMouseEntered

    private void searchfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchfieldMouseExited
        searchfield.setBackground(hover);
    }//GEN-LAST:event_searchfieldMouseExited

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfieldActionPerformed

    }//GEN-LAST:event_searchfieldActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        
    }//GEN-LAST:event_searchMouseClicked

    private void searchnavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchnavMouseEntered
        searchnav.setBackground(defaultcolor);
    }//GEN-LAST:event_searchnavMouseEntered

    private void searchnavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchnavMouseExited
        searchnav.setBackground(hover);
    }//GEN-LAST:event_searchnavMouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        sDashBoard sd = new sDashBoard();
        sd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
      addScholarship as = new addScholarship();
      as.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
             int rowIndex = tbl_scholarship1.getSelectedRow();


                if(rowIndex < 0 ){
                    JOptionPane.showMessageDialog(null, "Please select an item.", "Click a Item", JOptionPane.WARNING_MESSAGE);
                }else{

                    try{
                    dbConnect dc = new dbConnect();
                    TableModel tbl  = tbl_scholarship1.getModel();
                  ResultSet rs = dc.getData("SELECT * FROM tbl_scholarship WHERE s_id = '" + tbl.getValueAt(rowIndex, 0) + "'");

                    if(rs.next()){
                         updateForm uf = new updateForm();
                           uf.s_id.setText(""+rs.getInt("s_id"));
                          uf.sname.setText(""+rs.getString("s_name"));
                        uf.des.setText(""+rs.getString("description"));
                        uf.gpa.setText(""+rs.getString("GPA"));
                         uf.require.setText(""+rs.getString("requirements"));
                         uf.annincome.setText(""+rs.getString("annual_income"));
                         uf.amount.setText(""+rs.getString("fund_amount"));
                         uf.capacity.setText(""+rs.getString("capacity"));
                          uf.status.setSelectedItem(""+rs.getString("status"));
                          uf.deadline1.setText(""+rs.getString("Deadline"));
                          
                         uf.setVisible(true);
                        this.dispose();
                    }
                   }catch(SQLException e){
                                 System.out.println(""+e.getMessage());
                            }
                }
    }//GEN-LAST:event_editMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
       int rowIndex = tbl_scholarship1.getSelectedRow();

    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please select a scholarship to delete!", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this scholarship?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    
    if (confirm == JOptionPane.YES_OPTION) {
        try {
            dbConnect dc = new dbConnect();
            Connection con = dc.getConnection();
            TableModel tbl = tbl_scholarship1.getModel();

            int scholarshipID = Integer.parseInt(tbl.getValueAt(rowIndex, 0).toString()); // Get s_id

            String query = "DELETE FROM tbl_scholarship WHERE s_id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, scholarshipID);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Scholarship deleted successfully!");
                loadScholarships(); // Refresh table after deletion
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete scholarship. Please try again.");
            }

            pstmt.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_deleteMouseClicked

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
            java.util.logging.Logger.getLogger(scho_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(scho_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(scho_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(scho_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scho_table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backnav;
    private javax.swing.JLabel delete;
    private javax.swing.JPanel deletenav;
    private javax.swing.JLabel edit;
    private javax.swing.JPanel editnav;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchfield;
    private javax.swing.JPanel searchnav;
    private javax.swing.JTable tbl_scholarship1;
    private javax.swing.JPanel usersnav;
    // End of variables declaration//GEN-END:variables
}
