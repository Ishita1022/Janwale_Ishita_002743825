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
public class Patient extends Person
{
    private String uniqueID;
    private String name;
    private int age;
    private String gender;
    private int phone;
    private String address;
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge1() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

   
    public int getPhone2() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
}