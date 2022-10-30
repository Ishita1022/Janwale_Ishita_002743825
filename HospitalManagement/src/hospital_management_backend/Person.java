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
public class Person {
    private String name;
    private String address;
    private String gender;
    private int age;
    private Date dob;
    private int phone;
    


    public Person( String name, String address, String gender, int age, Date dob, int phone){
      
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age= age;
        this.dob = dob;
        this.phone = phone;
    }

    Person() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getname(){
        return getname();
    } 
    
            
    public void setname(String name){
        this.name = name ;
    }
    
    public String getAddress(){
        return getAddress();
    }
    
    public void setAddress(String Address){
    this.address = address;
    } 
            
    public String getGender(){
        return getGender();
    }
    
    public void setGender(){
    this.gender = gender;
    }
    public String getAge(){
        return getAge();
    }
    
    public void setAge(){
        this.age= age;
    }
    public String getDob(){
        return getDob();
    }
    
    public void setDob(){
        this.dob = dob;
    }
    public String getPhone(){
        return getPhone();
    }
    
    public void setPhone(){
        this.phone = phone;
    }
    
}

