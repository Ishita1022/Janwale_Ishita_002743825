/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr_management.Model;

import java.util.ArrayList;

/**
 *
 * @author ishitajanwale
 */
public class EmployeeInfo {
    
    private ArrayList<EmployeeProfile> info;
    
    public EmployeeInfo(){
        this.info = new ArrayList<EmployeeProfile>();
        
    }

    public ArrayList<EmployeeProfile> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<EmployeeProfile> info) {
        this.info = info;
    }
    
}
