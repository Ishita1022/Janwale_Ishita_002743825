/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital_management_backend;

import java.util.ArrayList;

/**
 *
 * @author ishitajanwale
 */
public class PatientDirectory {
    private ArrayList<Patient> dir = new ArrayList<>();
    
    public PatientDirectory(){
        this.dir = new ArrayList<>();
    }

    public void setDir(ArrayList<Patient> dir) {
        this.dir = dir;
    }
    
    public ArrayList<Patient> getDir() {
        return dir;
    }
    
    public Patient addPerson(){
        Patient person = new Patient();
        dir.add(person);
        return person;
    }
}