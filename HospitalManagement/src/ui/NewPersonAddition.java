/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.City;
import model.Community;
import model.Person;
import model.PersonDirectory;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JSplitPane;

/**
 *
 * @author Atharva
 */
public class NewPersonAddition extends javax.swing.JPanel {

    Person newPersonAddition;
    JSplitPane jSplitMainPane;

    /**
     * Creates new form NewPersonAddition
     */
    public NewPersonAddition(JSplitPane jSplitMainPane) {
        initComponents();
        this.jSplitMainPane = jSplitMainPane;
        this.newPersonAddition = new Person();
        this.personIdentifierJLabel.setText(String.valueOf(Person.PERSON_ID));
        this.newPersonAddition.personId = Person.PERSON_ID;
        generateDropdownCity();
        generateDropdownCommunity();

    }

    public void generateDropdownCity() {
        ArrayList<String> cityDropdown = new ArrayList<>();
        for (String cityValue : City.cityValues) {
            cityDropdown.add(String.valueOf(cityValue));
        }
        String[] citySDropdown = cityDropdown.toArray(new String[cityDropdown.size()]);
        DefaultComboBoxModel<String> yearsSDropdownModel = new DefaultComboBoxModel<>(citySDropdown);
        cityJComboBox.setModel(yearsSDropdownModel);
    }

    public void generateDropdownCommunity() {
        ArrayList<String> communityDropdown = new ArrayList<>();
        City.allCities.stream().filter(communityValue -> (communityValue.city == null ? cityJComboBox.getSelectedItem().toString() == null : communityValue.city.equals(cityJComboBox.getSelectedItem().toString()))).forEachOrdered(communityValue -> {
            communityDropdown.add(String.valueOf(communityValue.communityName));
        });
        String[] citySDropdown = communityDropdown.toArray(new String[communityDropdown.size()]);
        DefaultComboBoxModel<String> yearsSDropdownModel = new DefaultComboBoxModel<>(citySDropdown);
        this.communityJComboBox.setModel(yearsSDropdownModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameJField = new javax.swing.JTextField();
        seatsJLabel = new javax.swing.JLabel();
        maintenanceExpiryJLabel = new javax.swing.JLabel();
        dobDayJField = new javax.swing.JTextField();
        dummyJField3 = new javax.swing.JTextField();
        dobMonthJField = new javax.swing.JTextField();
        dummyJField2 = new javax.swing.JTextField();
        dobYearJField = new javax.swing.JTextField();
        seatsJLabel1 = new javax.swing.JLabel();
        addressJField = new javax.swing.JTextField();
        seatsJLabel2 = new javax.swing.JLabel();
        zipJField = new javax.swing.JTextField();
        seatsJLabel3 = new javax.swing.JLabel();
        stateJField = new javax.swing.JTextField();
        seatsJLabel4 = new javax.swing.JLabel();
        cardentifierJLabel = new javax.swing.JLabel();
        personIdentifierJLabel = new javax.swing.JTextField();
        seatsJLabel5 = new javax.swing.JLabel();
        emailJField = new javax.swing.JTextField();
        dummyJField4 = new javax.swing.JTextField();
        dummyJField5 = new javax.swing.JTextField();
        phoneNoJField1 = new javax.swing.JTextField();
        dummyJField6 = new javax.swing.JTextField();
        phoneNoJField2 = new javax.swing.JTextField();
        dummyJField7 = new javax.swing.JTextField();
        phoneNoJField3 = new javax.swing.JTextField();
        seatsJLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        seatsJLabel7 = new javax.swing.JLabel();
        cityJComboBox = new javax.swing.JComboBox<>();
        communityJComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(237, 126, 63));

        nameJField.setBackground(new java.awt.Color(238, 238, 238));
        nameJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nameJField.setToolTipText("Click to enter your name.");
        nameJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        nameJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameJFieldnameChangeHandler(evt);
            }
        });

        seatsJLabel.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel.setText("Name:");

        maintenanceExpiryJLabel.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        maintenanceExpiryJLabel.setForeground(new java.awt.Color(255, 255, 255));
        maintenanceExpiryJLabel.setText("DOB:");

        dobDayJField.setBackground(new java.awt.Color(238, 238, 238));
        dobDayJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dobDayJField.setText("DD");
        dobDayJField.setToolTipText("Enter date of birth here.");
        dobDayJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dobDayJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dobDayJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobDayJFielddateOfBirthFocusLost(evt);
            }
        });

        dummyJField3.setEditable(false);
        dummyJField3.setBackground(new java.awt.Color(216, 220, 228));
        dummyJField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dummyJField3.setText("/");
        dummyJField3.setToolTipText("");
        dummyJField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dummyJField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyJField3ActionPerformed(evt);
            }
        });

        dobMonthJField.setBackground(new java.awt.Color(238, 238, 238));
        dobMonthJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dobMonthJField.setText("MM");
        dobMonthJField.setToolTipText("Enter date of birth here.");
        dobMonthJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dobMonthJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dobMonthJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobMonthJFielddateOfBirthFocusLost(evt);
            }
        });

        dummyJField2.setEditable(false);
        dummyJField2.setBackground(new java.awt.Color(216, 220, 228));
        dummyJField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dummyJField2.setText("/");
        dummyJField2.setToolTipText("");
        dummyJField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dummyJField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyJField2ActionPerformed(evt);
            }
        });

        dobYearJField.setBackground(new java.awt.Color(238, 238, 238));
        dobYearJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dobYearJField.setText("YYYY");
        dobYearJField.setToolTipText("Enter date of birth here.");
        dobYearJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dobYearJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dobYearJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobYearJFielddateOfBirthFocusLost(evt);
            }
        });

        seatsJLabel1.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel1.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel1.setText("Address:");

        addressJField.setBackground(new java.awt.Color(238, 238, 238));
        addressJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        addressJField.setToolTipText("Click to enter your name.");
        addressJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        addressJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressJFieldnameChangeHandler(evt);
            }
        });
        addressJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressJFieldActionPerformed(evt);
            }
        });

        seatsJLabel2.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel2.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel2.setText("ZipCode:");

        zipJField.setBackground(new java.awt.Color(238, 238, 238));
        zipJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        zipJField.setToolTipText("Click to enter your name.");
        zipJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        zipJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                zipJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                zipJFieldnameChangeHandler(evt);
            }
        });
        zipJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipJFieldActionPerformed(evt);
            }
        });

        seatsJLabel3.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel3.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel3.setText("State:");

        stateJField.setBackground(new java.awt.Color(238, 238, 238));
        stateJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        stateJField.setToolTipText("Click to enter your name.");
        stateJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        stateJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                stateJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                stateJFieldnameChangeHandler(evt);
            }
        });

        seatsJLabel4.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel4.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel4.setText("Community Name:");

        cardentifierJLabel.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        cardentifierJLabel.setForeground(new java.awt.Color(255, 255, 255));
        cardentifierJLabel.setText("Person Identifier:");

        personIdentifierJLabel.setEditable(false);
        personIdentifierJLabel.setBackground(new java.awt.Color(238, 238, 238));
        personIdentifierJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        personIdentifierJLabel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        personIdentifierJLabel.setToolTipText("This is your identifier.");
        personIdentifierJLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        personIdentifierJLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personIdentifierJLabelActionPerformed(evt);
            }
        });

        seatsJLabel5.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel5.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel5.setText("Email ID:");

        emailJField.setBackground(new java.awt.Color(238, 238, 238));
        emailJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailJField.setToolTipText("Click to enter your name.");
        emailJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        emailJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailJFieldnameChangeHandler(evt);
            }
        });
        emailJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailJFieldActionPerformed(evt);
            }
        });

        dummyJField4.setEditable(false);
        dummyJField4.setBackground(new java.awt.Color(216, 220, 228));
        dummyJField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dummyJField4.setText("+1");
        dummyJField4.setToolTipText("");
        dummyJField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dummyJField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyJField4ActionPerformed(evt);
            }
        });

        dummyJField5.setEditable(false);
        dummyJField5.setBackground(new java.awt.Color(216, 220, 228));
        dummyJField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dummyJField5.setText("(");
        dummyJField5.setToolTipText("");
        dummyJField5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dummyJField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyJField5ActionPerformed(evt);
            }
        });

        phoneNoJField1.setBackground(new java.awt.Color(238, 238, 238));
        phoneNoJField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phoneNoJField1.setText("000");
        phoneNoJField1.setToolTipText("Enter phone no.");
        phoneNoJField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        phoneNoJField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNoJField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNoJField1phoneNoJField3FocusLost(evt);
            }
        });
        phoneNoJField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoJField1ActionPerformed(evt);
            }
        });

        dummyJField6.setEditable(false);
        dummyJField6.setBackground(new java.awt.Color(216, 220, 228));
        dummyJField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dummyJField6.setText(")");
        dummyJField6.setToolTipText("");
        dummyJField6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dummyJField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyJField6ActionPerformed(evt);
            }
        });

        phoneNoJField2.setBackground(new java.awt.Color(238, 238, 238));
        phoneNoJField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phoneNoJField2.setText("000");
        phoneNoJField2.setToolTipText("Enter phone no.");
        phoneNoJField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        phoneNoJField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNoJField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNoJField2phoneNoJField3FocusLost(evt);
            }
        });
        phoneNoJField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoJField2ActionPerformed(evt);
            }
        });

        dummyJField7.setEditable(false);
        dummyJField7.setBackground(new java.awt.Color(216, 220, 228));
        dummyJField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dummyJField7.setText("-");
        dummyJField7.setToolTipText("");
        dummyJField7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dummyJField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyJField7ActionPerformed(evt);
            }
        });

        phoneNoJField3.setBackground(new java.awt.Color(238, 238, 238));
        phoneNoJField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phoneNoJField3.setText("0000");
        phoneNoJField3.setToolTipText("Enter phone no.");
        phoneNoJField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        phoneNoJField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNoJField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNoJField3FocusLost(evt);
            }
        });
        phoneNoJField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoJField3ActionPerformed(evt);
            }
        });

        seatsJLabel6.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel6.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel6.setText("Mobile No:");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(238, 238, 238));
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Person");

        seatsJLabel7.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel7.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel7.setText("City:");

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
        cityJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityJComboBoxActionPerformed(evt);
            }
        });
        cityJComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cityJComboBoxPropertyChange(evt);
            }
        });

        communityJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityJComboBoxActionPerformed(evt);
            }
        });
        communityJComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                communityJComboBoxPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seatsJLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seatsJLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seatsJLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cardentifierJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seatsJLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seatsJLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seatsJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(maintenanceExpiryJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seatsJLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seatsJLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dobDayJField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dummyJField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dobMonthJField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dummyJField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dobYearJField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dummyJField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dummyJField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phoneNoJField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dummyJField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phoneNoJField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dummyJField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phoneNoJField3))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameJField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressJField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipJField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateJField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(communityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailJField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personIdentifierJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(567, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatsJLabel)
                    .addComponent(nameJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatsJLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatsJLabel2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatsJLabel7)
                    .addComponent(cityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatsJLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatsJLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintenanceExpiryJLabel)
                    .addComponent(dobDayJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dummyJField3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobMonthJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dummyJField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobYearJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatsJLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dummyJField5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoJField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dummyJField6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dummyJField7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoJField3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoJField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dummyJField4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatsJLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personIdentifierJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardentifierJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameJFieldFocusGained
        if (nameJField.getText().equals("Enter here")) {
            nameJField.setText("");
        }
    }//GEN-LAST:event_nameJFieldFocusGained

    private void nameJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJFieldnameChangeHandler

    private void dobDayJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobDayJFieldFocusGained
        if (dobDayJField.getText().equals("DD")) {
            dobDayJField.setText("");
        }
    }//GEN-LAST:event_dobDayJFieldFocusGained

    private void dobDayJFielddateOfBirthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobDayJFielddateOfBirthFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dobDayJFielddateOfBirthFocusLost

    private void dummyJField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dummyJField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dummyJField3ActionPerformed

    private void dobMonthJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobMonthJFieldFocusGained
        if (dobMonthJField.getText().equals("MM")) {
            dobMonthJField.setText("");
        }
    }//GEN-LAST:event_dobMonthJFieldFocusGained

    private void dobMonthJFielddateOfBirthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobMonthJFielddateOfBirthFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dobMonthJFielddateOfBirthFocusLost

    private void dummyJField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dummyJField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dummyJField2ActionPerformed

    private void dobYearJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobYearJFieldFocusGained
        if (dobYearJField.getText().equals("YYYY")) {
            dobYearJField.setText("");
        }
    }//GEN-LAST:event_dobYearJFieldFocusGained

    private void dobYearJFielddateOfBirthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobYearJFielddateOfBirthFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dobYearJFielddateOfBirthFocusLost

    private void addressJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressJFieldFocusGained
        if (addressJField.getText().equals("Enter here")) {
            addressJField.setText("");
        }
    }//GEN-LAST:event_addressJFieldFocusGained

    private void addressJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_addressJFieldnameChangeHandler

    private void addressJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressJFieldActionPerformed

    private void zipJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zipJFieldFocusGained
        if (zipJField.getText().equals("Enter here")) {
            zipJField.setText("");
        }
    }//GEN-LAST:event_zipJFieldFocusGained

    private void zipJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zipJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_zipJFieldnameChangeHandler

    private void zipJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipJFieldActionPerformed

    private void stateJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stateJFieldFocusGained
        if (stateJField.getText().equals("Enter here")) {
            stateJField.setText("");
        }
    }//GEN-LAST:event_stateJFieldFocusGained

    private void stateJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stateJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_stateJFieldnameChangeHandler

    private void personIdentifierJLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personIdentifierJLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personIdentifierJLabelActionPerformed

    private void emailJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailJFieldFocusGained
        if (emailJField.getText().equals("Enter here")) {
            emailJField.setText("");
        }
    }//GEN-LAST:event_emailJFieldFocusGained

    private void emailJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_emailJFieldnameChangeHandler

    private void emailJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailJFieldActionPerformed

    private void dummyJField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dummyJField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dummyJField4ActionPerformed

    private void dummyJField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dummyJField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dummyJField5ActionPerformed

    private void phoneNoJField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNoJField1FocusGained
        if (phoneNoJField1.getText().equals("000")) {
            phoneNoJField1.setText("");
        }
    }//GEN-LAST:event_phoneNoJField1FocusGained

    private void phoneNoJField1phoneNoJField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNoJField1phoneNoJField3FocusLost
        //TODO
    }//GEN-LAST:event_phoneNoJField1phoneNoJField3FocusLost

    private void phoneNoJField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoJField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoJField1ActionPerformed

    private void dummyJField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dummyJField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dummyJField6ActionPerformed

    private void phoneNoJField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNoJField2FocusGained
        if (phoneNoJField2.getText().equals("000")) {
            phoneNoJField2.setText("");
        }
    }//GEN-LAST:event_phoneNoJField2FocusGained

    private void phoneNoJField2phoneNoJField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNoJField2phoneNoJField3FocusLost
        //TODO
    }//GEN-LAST:event_phoneNoJField2phoneNoJField3FocusLost

    private void phoneNoJField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoJField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoJField2ActionPerformed

    private void dummyJField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dummyJField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dummyJField7ActionPerformed

    private void phoneNoJField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNoJField3FocusGained
        if (phoneNoJField3.getText().equals("0000")) {
            phoneNoJField3.setText("");
        }
    }//GEN-LAST:event_phoneNoJField3FocusGained

    private void phoneNoJField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNoJField3FocusLost
        //TODO
    }//GEN-LAST:event_phoneNoJField3FocusLost

    private void phoneNoJField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoJField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoJField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String errorMessage = "";
        String nameErrorMessage = newPersonAddition.validateName(this.nameJField.getText());
        String addressErrorMessage = newPersonAddition.address.validateAddress(this.addressJField.getText());
        String zipCodeErrorMessage = newPersonAddition.address.validateZipCode(this.zipJField.getText());
        String cityErrorMessage = newPersonAddition.city.validateCity(this.cityJComboBox.getSelectedItem().toString());
        String stateErrorMessage = newPersonAddition.city.validateState(this.stateJField.getText());
        String communityNameErrorMessage = newPersonAddition.community.validateCommunityName(this.communityJComboBox.getSelectedItem() != null ? this.communityJComboBox.getSelectedItem().toString() : "");

        String dobValue = dobDayJField.getText().trim() + "/" + dobMonthJField.getText().trim() + "/" + dobYearJField.getText().trim();
        String dobErrorMessage = newPersonAddition.validateDOB(dobValue);

        String emailErrorMessage = newPersonAddition.validateEmail(this.emailJField.getText());

        String phoneValue = phoneNoJField1.getText().trim() + "-" + phoneNoJField2.getText().trim() + "-" + phoneNoJField3.getText().trim();
        String phoneErrorMessage = newPersonAddition.validateMobileNo(phoneValue);

        errorMessage += nameErrorMessage;
        errorMessage += addressErrorMessage;
        errorMessage += zipCodeErrorMessage;
        errorMessage += cityErrorMessage;
        errorMessage += stateErrorMessage;
        errorMessage += communityNameErrorMessage;
        errorMessage += dobErrorMessage;
        errorMessage += emailErrorMessage;
        errorMessage += phoneErrorMessage;

        if (!errorMessage.equals("")) {
            JOptionPane.showMessageDialog(this, errorMessage, "Create Person", ERROR_MESSAGE);
            return;
        }

        newPersonAddition.name = this.nameJField.getText();
        newPersonAddition.address.address = this.addressJField.getText();
        newPersonAddition.address.zipcode = this.zipJField.getText();
        newPersonAddition.city.city = this.cityJComboBox.getSelectedItem().toString();
        newPersonAddition.city.state = this.stateJField.getText();
        newPersonAddition.community.communityName = this.communityJComboBox.getSelectedItem().toString();
        newPersonAddition.mobileNo = phoneNoJField1.getText().trim() + "-" + phoneNoJField2.getText().trim() + "-" + phoneNoJField3.getText().trim();
        newPersonAddition.email = emailJField.getText();
        DateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dateFormatter.setLenient(false);
            newPersonAddition.dob = (dateFormatter.parse(dobDayJField.getText().trim() + "/" + dobMonthJField.getText().trim() + "/" + dobYearJField.getText().trim()));
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        Person.PERSON_ID++;
        PersonDirectory.allPeople.add(newPersonAddition);
        JOptionPane.showMessageDialog(this, "Person created successfully!!", "Create Person", INFORMATION_MESSAGE);
        AdminView adminViewDashboard = new AdminView();
        this.jSplitMainPane.setRightComponent(adminViewDashboard);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cityJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cityJComboBoxItemStateChanged
        generateDropdownCommunity();
    }//GEN-LAST:event_cityJComboBoxItemStateChanged

    private void cityJComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityJComboBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJComboBoxFocusGained

    private void cityJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJComboBoxActionPerformed

    private void cityJComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cityJComboBoxPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJComboBoxPropertyChange

    private void communityJComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_communityJComboBoxPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_communityJComboBoxPropertyChange

    private void communityJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJField;
    private javax.swing.JLabel cardentifierJLabel;
    private javax.swing.JComboBox<String> cityJComboBox;
    private javax.swing.JComboBox<String> communityJComboBox;
    private javax.swing.JTextField dobDayJField;
    private javax.swing.JTextField dobMonthJField;
    private javax.swing.JTextField dobYearJField;
    private javax.swing.JTextField dummyJField2;
    private javax.swing.JTextField dummyJField3;
    private javax.swing.JTextField dummyJField4;
    private javax.swing.JTextField dummyJField5;
    private javax.swing.JTextField dummyJField6;
    private javax.swing.JTextField dummyJField7;
    private javax.swing.JTextField emailJField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel maintenanceExpiryJLabel;
    private javax.swing.JTextField nameJField;
    private javax.swing.JTextField personIdentifierJLabel;
    private javax.swing.JTextField phoneNoJField1;
    private javax.swing.JTextField phoneNoJField2;
    private javax.swing.JTextField phoneNoJField3;
    private javax.swing.JLabel seatsJLabel;
    private javax.swing.JLabel seatsJLabel1;
    private javax.swing.JLabel seatsJLabel2;
    private javax.swing.JLabel seatsJLabel3;
    private javax.swing.JLabel seatsJLabel4;
    private javax.swing.JLabel seatsJLabel5;
    private javax.swing.JLabel seatsJLabel6;
    private javax.swing.JLabel seatsJLabel7;
    private javax.swing.JTextField stateJField;
    private javax.swing.JTextField zipJField;
    // End of variables declaration//GEN-END:variables
}