/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author ishita
 */
public class DoctorPanelHome extends javax.swing.JPanel {

    /**
     * Creates new form DoctorPanelHome
     */
    public DoctorPanelHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPaneDoctorPanel = new javax.swing.JSplitPane();
        controlPanelDoctor = new javax.swing.JPanel();
        btnCreateEncounter = new javax.swing.JButton();
        btnViewEncounter = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        viewPanelDoctor = new javax.swing.JPanel();

        jSplitPaneDoctorPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        controlPanelDoctor.setBackground(new java.awt.Color(255, 255, 255));

        btnCreateEncounter.setBackground(new java.awt.Color(200, 200, 233));
        btnCreateEncounter.setText("Create Encounter");
        btnCreateEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEncounterActionPerformed(evt);
            }
        });

        btnViewEncounter.setBackground(new java.awt.Color(200, 200, 233));
        btnViewEncounter.setText("View Encounter");

        jButton1.setBackground(new java.awt.Color(200, 200, 233));
        jButton1.setText("Create Vital Signs");

        jButton2.setBackground(new java.awt.Color(200, 200, 233));
        jButton2.setText("View Vital Signs");

        javax.swing.GroupLayout controlPanelDoctorLayout = new javax.swing.GroupLayout(controlPanelDoctor);
        controlPanelDoctor.setLayout(controlPanelDoctorLayout);
        controlPanelDoctorLayout.setHorizontalGroup(
            controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelDoctorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCreateEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnViewEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        controlPanelDoctorLayout.setVerticalGroup(
            controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelDoctorLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCreateEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jSplitPaneDoctorPanel.setLeftComponent(controlPanelDoctor);

        viewPanelDoctor.setBackground(new java.awt.Color(200, 200, 233));

        javax.swing.GroupLayout viewPanelDoctorLayout = new javax.swing.GroupLayout(viewPanelDoctor);
        viewPanelDoctor.setLayout(viewPanelDoctorLayout);
        viewPanelDoctorLayout.setHorizontalGroup(
            viewPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 882, Short.MAX_VALUE)
        );
        viewPanelDoctorLayout.setVerticalGroup(
            viewPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        jSplitPaneDoctorPanel.setRightComponent(viewPanelDoctor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 882, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSplitPaneDoctorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSplitPaneDoctorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEncounterActionPerformed
        // TODO add your handling code here:
        //AddEncounterPanelDoctor encounterDoctor = new AddEncounterPanelDoctor(systemAdmin);
        //jSplitPaneDoctorPanel.setRightComponent(encounterDoctor);

    }//GEN-LAST:event_btnCreateEncounterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEncounter;
    private javax.swing.JButton btnViewEncounter;
    private javax.swing.JPanel controlPanelDoctor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JSplitPane jSplitPaneDoctorPanel;
    private javax.swing.JPanel viewPanelDoctor;
    // End of variables declaration//GEN-END:variables
}
