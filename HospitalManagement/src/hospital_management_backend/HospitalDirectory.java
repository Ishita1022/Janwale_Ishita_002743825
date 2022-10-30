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
public class HospitalDirectory {
    private ArrayList<Hospital> hosl = new ArrayList<>();
    
    public HospitalDirectory(){
        this.hosl = new ArrayList<>();
    }

    public ArrayList<Hospital> getHosl() {
        return hosl;
    }

    public void setHosl(ArrayList<Hospital> dir) {
        this.hosl = hosl;
    }
    
    
    public Hospital addHospital(){
        Hospital hos = new Hospital();
        hosl.add(hos);
        return hos;
    }
}
