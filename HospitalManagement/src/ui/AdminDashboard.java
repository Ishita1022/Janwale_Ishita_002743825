/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import model.City;
import model.Community;
import model.PatientDirectory;
import model.PersonDirectory;

/**
 *
 * @author Atharva
 */
public class AdminDashboard extends javax.swing.JPanel {

    /**
     * Creates new form AdminDashboard
     *
     * @param jSplitPane
     */
    public AdminDashboard() {
        initComponents();
        getAllCommunities();
    }

    public void getAllCommunities() {
        int count = 0;
        for (int i = 0; i < City.allCities.size(); i++) {
            Community ongoing = City.allCities.get(i);
            count += 1;
        }
  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutJButton2 = new javax.swing.JButton();

        logoutJButton2.setBackground(new java.awt.Color(0, 0, 0));
        logoutJButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        logoutJButton2.setForeground(new java.awt.Color(255, 255, 255));
        logoutJButton2.setText("Logout");

        setBackground(new java.awt.Color(237, 126, 63));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1627, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1212, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton logoutJButton2;
    // End of variables declaration//GEN-END:variables
}
