/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.Doctor;
import model.DoctorDirectory;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author Atharva
 */
public class DoctorView extends javax.swing.JPanel {

    /**
     * Creates new form AdminView
     */
    public DoctorView() {
        initComponents();
        jSplitPane1.setDividerLocation((int) (0.35 * (new Dimension(Toolkit.getDefaultToolkit().getScreenSize()).width - 300)));
        DefaultListModel model = new DefaultListModel();
        detailsJPanel.setVisible(false);
        if (DoctorDirectory.allDoctor.isEmpty()) {
            uploadedJList.setModel(model);
            JOptionPane.showMessageDialog(this, "Doctor Directory Empty!", "View Details", ERROR_MESSAGE);
        } else {
            DoctorDirectory.allDoctor.forEach(car -> {
                model.addElement(car.personId + " - " + car.name);
            });
            uploadedJList.setModel(model);
            uploadedJList.setSelectedIndex(0);
            try {
                openSelectedProfile();
            } catch (ParseException ex) {
                Logger.getLogger(DoctorView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        detailsJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addressJLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        identifierJLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        zipCodeJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cityJLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stateJLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dobJLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        emailJLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mobileNoJLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        uploadedJList = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(237, 126, 63));

        jLabel1.setBackground(new java.awt.Color(237, 126, 63));
        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Directory");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        detailsJPanel.setBackground(new java.awt.Color(237, 126, 63));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");

        nameJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        nameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameJLabel.setText("Select Person to see details!");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hospital Name:");

        addressJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addressJLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressJLabel.setText("Select Person to see details!");

        jLabel4.setBackground(new java.awt.Color(0, 51, 153));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Doctor Identifier:");

        identifierJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        identifierJLabel.setForeground(new java.awt.Color(255, 255, 255));
        identifierJLabel.setText("Select Person to see details!");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Zip Code:");

        zipCodeJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        zipCodeJLabel.setForeground(new java.awt.Color(255, 255, 255));
        zipCodeJLabel.setText("Select Person to see details!");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City:");

        cityJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cityJLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityJLabel.setText("Select Person to see details!");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("State:");

        stateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        stateJLabel.setForeground(new java.awt.Color(255, 255, 255));
        stateJLabel.setText("Select Person to see details!");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DOB:");

        dobJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        dobJLabel.setForeground(new java.awt.Color(255, 255, 255));
        dobJLabel.setText("Select Person to see details!");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email ID:");

        emailJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        emailJLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailJLabel.setText("Select Person to see details!");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mobile No.:");

        mobileNoJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        mobileNoJLabel.setForeground(new java.awt.Color(255, 255, 255));
        mobileNoJLabel.setText("Select Person to see details!");

        javax.swing.GroupLayout detailsJPanelLayout = new javax.swing.GroupLayout(detailsJPanel);
        detailsJPanel.setLayout(detailsJPanelLayout);
        detailsJPanelLayout.setHorizontalGroup(
            detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsJPanelLayout.createSequentialGroup()
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsJPanelLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailJLabel)
                            .addComponent(dobJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileNoJLabel)))
                    .addGroup(detailsJPanelLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel4)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(detailsJPanelLayout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameJLabel)
                        .addComponent(addressJLabel)
                        .addComponent(identifierJLabel)
                        .addComponent(zipCodeJLabel)
                        .addComponent(cityJLabel)
                        .addComponent(stateJLabel))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        detailsJPanelLayout.setVerticalGroup(
            detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(196, 196, 196)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dobJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(emailJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(mobileNoJLabel))
                .addContainerGap(225, Short.MAX_VALUE))
            .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(detailsJPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(identifierJLabel)
                    .addGap(18, 18, 18)
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nameJLabel))
                    .addGap(18, 18, 18)
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(addressJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(zipCodeJLabel))
                    .addGap(18, 18, 18)
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cityJLabel))
                    .addGap(18, 18, 18)
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(stateJLabel))
                    .addContainerGap(315, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(237, 126, 63));

        uploadedJList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uploadedJListFocusGained(evt);
            }
        });
        uploadedJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadedJListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(uploadedJList);

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Directory:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSplitPane1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jSplitPane1)
                    .addGap(22, 22, 22)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void uploadedJListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uploadedJListFocusGained
        try {
            openSelectedProfile();
        } catch (ParseException ex) {
            Logger.getLogger(DoctorView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uploadedJListFocusGained

    private void uploadedJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadedJListMouseClicked
        try {
            openSelectedProfile();
        } catch (ParseException ex) {
            Logger.getLogger(DoctorView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uploadedJListMouseClicked

    private void openSelectedProfile() throws ParseException {
//        int seletedDoctorIndex = uploadedJList.getSelectedIndex();
//        if (seletedDoctorIndex != -1) {
//            Doctor selectedDoctor = DoctorDirectory.allDoctor.get(seletedDoctorIndex);
//            detailsJPanel.setVisible(true);
//            identifierJLabel.setText(String.valueOf(selectedDoctor.doctorId));
//            nameJLabel.setText(String.valueOf(selectedDoctor.name));
//            addressJLabel.setText(String.valueOf(selectedDoctor.hospitalname));
//            zipCodeJLabel.setText(String.valueOf(selectedDoctor.address.zipcode));
//            cityJLabel.setText(String.valueOf(selectedDoctor.city.city));
//            stateJLabel.setText(String.valueOf(selectedDoctor.city.state));
//            emailJLabel.setText(String.valueOf(selectedDoctor.email));
//            mobileNoJLabel.setText(String.valueOf(selectedDoctor.mobileNo));
//        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JPanel detailsJPanel;
    private javax.swing.JLabel dobJLabel;
    private javax.swing.JLabel emailJLabel;
    private javax.swing.JLabel identifierJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel mobileNoJLabel;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JLabel stateJLabel;
    private javax.swing.JList<String> uploadedJList;
    private javax.swing.JLabel zipCodeJLabel;
    // End of variables declaration//GEN-END:variables
}
