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
public class DoctorDirectory {
    private ArrayList<Doctor> doctorDir = new ArrayList<>();
    
    public DoctorDirectory(){
        this.doctorDir = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorDir() {
        return doctorDir;
    }

    public void setDoctorDir(ArrayList<Doctor> doctorDir) {
        this.doctorDir = doctorDir;
    }
    
    public Doctor addDcotorPerson(){
        Doctor doc = new Doctor();
        doctorDir.add(doc);
        return doc;
    }
}