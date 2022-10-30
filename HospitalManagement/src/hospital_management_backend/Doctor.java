/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital_management_backend;

import java.util.Date;

/**
 *
 * @author ishitajanwale
 */
public class Doctor extends Person{
    private String mdeicalLicenseNumber;
    private String name;
    private String password;
    private String address;
    private String gender;
    private int age;
    private Date dob;
    private int phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge1() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob1() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getPhone1() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMdeicalLicenseNumber() {
        return mdeicalLicenseNumber;
    }

    public void setMdeicalLicenseNumber(String mdeicalLicenseNumber) {
        this.mdeicalLicenseNumber = mdeicalLicenseNumber;
    }
}


