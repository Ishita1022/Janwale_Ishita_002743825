/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.City;
import model.Community;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Atharva
 */
public class AdminAddCityCommunity extends javax.swing.JPanel {

    /**
     * Creates new form AdminAddCityCommunity
     */
    public AdminAddCityCommunity() {
        initComponents();
        generateDropdown();
        DefaultTableModel model = (DefaultTableModel) cityJTable.getModel();
        model.setRowCount(0);
        updateTable();
    }

    public void generateDropdown() {
        ArrayList<String> cityDropdown = new ArrayList<>();
        for (String cityValue : City.cityValues) {
            cityDropdown.add(String.valueOf(cityValue));
        }
        String[] citySDropdown = cityDropdown.toArray(new String[cityDropdown.size()]);
        DefaultComboBoxModel<String> yearsSDropdownModel = new DefaultComboBoxModel<>(citySDropdown);
        cityJComboBox.setModel(yearsSDropdownModel);
    }

    public void updateTable() {
        DefaultTableModel model = (DefaultTableModel) cityJTable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < City.allCities.size(); i++) {
            Object[] row = {City.allCities.get(i).city, City.allCities.get(i).communityName, City.allCities.get(i).createdAt};
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        brandJLabel = new javax.swing.JLabel();
        cityJComboBox = new javax.swing.JComboBox<>();
        seatsJLabel = new javax.swing.JLabel();
        communityJField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cityJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(237, 126, 63));

        brandJLabel.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        brandJLabel.setForeground(new java.awt.Color(255, 255, 255));
        brandJLabel.setText("City:");

        cityJComboBox.setBackground(new java.awt.Color(222, 222, 222));
        cityJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cityJComboBoxItemStateChanged(evt);
            }
        });
        cityJComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cityJComboBoxFocusGained(evt);
            }
        });
        cityJComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cityJComboBoxPropertyChange(evt);
            }
        });

        seatsJLabel.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel.setText("Community Name:");

        communityJField.setBackground(new java.awt.Color(238, 238, 238));
        communityJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        communityJField.setToolTipText("Click to enter your name.");
        communityJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        communityJField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        communityJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                communityJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                communityJFieldnameChangeHandler(evt);
            }
        });
        communityJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityJFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add City and Community");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cityJTable.setBackground(new java.awt.Color(222, 222, 222));
        cityJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "City", "Community", "Created At"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cityJTable);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/City(1).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seatsJLabel)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(brandJLabel)
                                        .addGap(35, 35, 35)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(communityJField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brandJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seatsJLabel)
                            .addComponent(communityJField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cityJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cityJComboBoxItemStateChanged
        //TOdo
    }//GEN-LAST:event_cityJComboBoxItemStateChanged

    private void cityJComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityJComboBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJComboBoxFocusGained

    private void cityJComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cityJComboBoxPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJComboBoxPropertyChange

    private void communityJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_communityJFieldFocusGained
        if (communityJField.getText().equals("Enter here")) {
            communityJField.setText("");
        }
    }//GEN-LAST:event_communityJFieldFocusGained

    private void communityJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_communityJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_communityJFieldnameChangeHandler

    private void communityJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityJFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String errorMessage = "";
        Community community = new Community();

        if (cityJComboBox.getSelectedIndex() == -1) {
            errorMessage += "Please select City! \n";
        }
        String communityErrorMessage = community.validateCommunityName(communityJField.getText());
        errorMessage += communityErrorMessage;

        if (community.alreadtExists(cityJComboBox.getSelectedItem().toString(), communityJField.getText())) {
            errorMessage += "Community already registered with the selected City \n";
        }
        if (errorMessage.length() != 0) {
            JOptionPane.showMessageDialog(this, errorMessage, "Add City", ERROR_MESSAGE);
        } else {
            community.communityName = communityJField.getText();
            community.city = cityJComboBox.getSelectedItem().toString();
            community.createdAt = new Date();
            City.allCities.add(community);
            updateTable();
            JOptionPane.showMessageDialog(this, "Added successfully!", "Addition", INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brandJLabel;
    private javax.swing.JComboBox<String> cityJComboBox;
    private javax.swing.JTable cityJTable;
    private javax.swing.JTextField communityJField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel seatsJLabel;
    // End of variables declaration//GEN-END:variables
}
