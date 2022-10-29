/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.City;
import model.Community;
import model.PersonDirectory;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JSplitPane;

/**
 *
 * @author Atharva
 */
public class AdminUpdateCityCommunity extends javax.swing.JPanel {

    Community selectedCommunity;
    int selectedIndex;
    JSplitPane jSplitMainPane;

    /**
     * Creates new form AdminUpdateCityCommunity
     * @param jSplitMainPane
     */
    public AdminUpdateCityCommunity(JSplitPane jSplitMainPane) {
        initComponents();
        this.jSplitMainPane = jSplitMainPane;
        jSplitPane1.setDividerLocation((int) (0.2 * (new Dimension(Toolkit.getDefaultToolkit().getScreenSize()).width - 300)));
        generateDropdown();

        DefaultListModel model = new DefaultListModel();

        if (City.allCities.isEmpty()) {
            cityJList.setModel(model);
            JOptionPane.showMessageDialog(this, "No city/community found!!", "City Details", ERROR_MESSAGE);
        } else {
            City.allCities.forEach(city -> {
                model.addElement(city.city + " - " + city.communityName);
            });
            cityJList.setModel(model);
            cityJList.setSelectedIndex(0);
            openSelectedProfile();
        }
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

    public void openSelectedProfile() {
        selectedIndex = cityJList.getSelectedIndex();//get the index of the selection made in the left section.
        if (selectedIndex != -1) {
            selectedCommunity = City.allCities.get(selectedIndex);
            cityJComboBox.setSelectedItem(selectedCommunity.city);
            communityJField.setText(selectedCommunity.communityName);
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        brandJLabel = new javax.swing.JLabel();
        cityJComboBox = new javax.swing.JComboBox<>();
        seatsJLabel = new javax.swing.JLabel();
        communityJField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cityJList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(11, 48, 56));

        jPanel1.setBackground(new java.awt.Color(237, 126, 63));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        brandJLabel.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        brandJLabel.setForeground(new java.awt.Color(255, 255, 255));
        brandJLabel.setText("City:");

        cityJComboBox.setBackground(new java.awt.Color(238, 238, 238));
        cityJComboBox.setForeground(new java.awt.Color(255, 255, 255));
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
        communityJField.setForeground(new java.awt.Color(255, 255, 255));
        communityJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        communityJField.setText("Enter here");
        communityJField.setToolTipText("Click to enter your name.");
        communityJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(seatsJLabel)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(brandJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton1)
                        .addGap(100, 100, 100)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cityJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(communityJField, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(140, 140, 140))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatsJLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(476, 476, 476))
        );

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(237, 126, 63));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        cityJList.setBackground(new java.awt.Color(238, 238, 238));
        cityJList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cityJListFocusGained(evt);
            }
        });
        cityJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cityJListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cityJList);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("List:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jLabel1.setBackground(new java.awt.Color(237, 126, 63));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update People Directory");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cityJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityJListMouseClicked
        openSelectedProfile();
    }//GEN-LAST:event_cityJListMouseClicked

    private void cityJListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityJListFocusGained
        openSelectedProfile();
    }//GEN-LAST:event_cityJListFocusGained

    private void communityJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityJFieldActionPerformed

    private void communityJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_communityJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_communityJFieldnameChangeHandler

    private void communityJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_communityJFieldFocusGained
        if (communityJField.getText().equals("Enter here")) {
            communityJField.setText("");
        }
    }//GEN-LAST:event_communityJFieldFocusGained

    private void cityJComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cityJComboBoxPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJComboBoxPropertyChange

    private void cityJComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityJComboBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJComboBoxFocusGained

    private void cityJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cityJComboBoxItemStateChanged
        //TOdo
    }//GEN-LAST:event_cityJComboBoxItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (selectedCommunity == null) {
            JOptionPane.showMessageDialog(this, "Please select a city to delete!", "Delete City", ERROR_MESSAGE);
            return;
        }
        City.allCities.remove(selectedIndex);
        JOptionPane.showMessageDialog(this, "Deleted successfully!!", "Delete city", INFORMATION_MESSAGE);

        AdminAddCityCommunity cityCommunityDashbaord = new AdminAddCityCommunity();
        this.jSplitMainPane.setRightComponent(cityCommunityDashbaord);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (selectedCommunity == null) {
            JOptionPane.showMessageDialog(this, "Please select a city to edit!", "Update City", ERROR_MESSAGE);
            return;
        }

        String errorMessage = "";
        if (cityJComboBox.getSelectedIndex() == -1) {
            errorMessage += "Please select City! \n";
        }
        String communityErrorMessage = selectedCommunity.validateCommunityName(communityJField.getText());
        errorMessage += communityErrorMessage;

        if (selectedCommunity.alreadtExists(cityJComboBox.getSelectedItem().toString(), communityJField.getText())) {
            errorMessage += "Community already registered with the selected City \n";
        }
        if (errorMessage.length() != 0) {
            JOptionPane.showMessageDialog(this, errorMessage, "Add City", ERROR_MESSAGE);
        } else {
            selectedCommunity.city = cityJComboBox.getSelectedItem().toString();
            selectedCommunity.communityName = communityJField.getText();
            selectedCommunity.createdAt = new Date();
            City.allCities.set(selectedIndex, selectedCommunity);
            JOptionPane.showMessageDialog(this, "Updated successfully!", "Update City", INFORMATION_MESSAGE);
            AdminAddCityCommunity cityCommunityDashbaord = new AdminAddCityCommunity();
            this.jSplitMainPane.setRightComponent(cityCommunityDashbaord);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brandJLabel;
    private javax.swing.JComboBox<String> cityJComboBox;
    private javax.swing.JList<String> cityJList;
    private javax.swing.JTextField communityJField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel seatsJLabel;
    // End of variables declaration//GEN-END:variables
}
