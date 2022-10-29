/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.User;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author Atharva
 */
public class LoginPage extends javax.swing.JPanel {

    public JSplitPane jSplitPane;
    public JPanel leftJPanel;
    public JPanel rightJPanel;
    public JButton logoutJButton;

    /**
     * Creates new form LoginPage
     */
    public LoginPage(JSplitPane jSplitPane, JPanel leftJPanel, JPanel rightJPanel, JButton logoutJButton) {
        initComponents();
        this.jSplitPane = jSplitPane;
        this.leftJPanel = leftJPanel;
        this.rightJPanel = rightJPanel;
        this.logoutJButton = logoutJButton;
        jSplitPane.setDividerLocation(0);
    }

    LoginPage() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        loginJButton1 = new javax.swing.JButton();
        loginJButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(237, 126, 63));

        loginJButton.setBackground(new java.awt.Color(0, 0, 0));
        loginJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        loginJButton.setForeground(new java.awt.Color(255, 255, 255));
        loginJButton.setText("System Admin Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        loginJButton1.setBackground(new java.awt.Color(0, 0, 0));
        loginJButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        loginJButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginJButton1.setText("Community Admin Login");
        loginJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButton1ActionPerformed(evt);
            }
        });

        loginJButton2.setBackground(new java.awt.Color(0, 0, 0));
        loginJButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        loginJButton2.setForeground(new java.awt.Color(255, 255, 255));
        loginJButton2.setText("Doctor Login");
        loginJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginJButton1)
                            .addComponent(loginJButton2))
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(loginJButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(loginJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(235, 235, 235))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
                    AdminDashboard adminDashboard = new AdminDashboard();
                    AdminLeftSection adminOptions = new AdminLeftSection(jSplitPane, leftJPanel, rightJPanel);
                    jSplitPane.setRightComponent(adminDashboard);
                    jSplitPane.setLeftComponent(adminOptions);
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void loginJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButton1ActionPerformed
                    AdminDashboard adminDashboard = new AdminDashboard();
                    CAdminLeftSection adminOptions = new CAdminLeftSection(jSplitPane, leftJPanel, rightJPanel);
                    jSplitPane.setRightComponent(adminDashboard);
                    jSplitPane.setLeftComponent(adminOptions);       
    }//GEN-LAST:event_loginJButton1ActionPerformed

    private void loginJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButton2ActionPerformed
                    AdminDashboard adminDashboard = new AdminDashboard();
                    DoctorLeftSection adminOptions = new DoctorLeftSection(jSplitPane, leftJPanel, rightJPanel);
                    jSplitPane.setRightComponent(adminDashboard);
                    jSplitPane.setLeftComponent(adminOptions);    // TODO add your handling code here:
    }//GEN-LAST:event_loginJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton loginJButton;
    private javax.swing.JButton loginJButton1;
    private javax.swing.JButton loginJButton2;
    // End of variables declaration//GEN-END:variables
}
