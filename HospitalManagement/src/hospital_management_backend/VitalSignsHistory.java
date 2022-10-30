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

    public class VitalSignsHistory {
    private ArrayList<VitalSigns> vitalSignsHistory = new ArrayList<>();

    public VitalSignsHistory() {
        this.vitalSignsHistory = new ArrayList<>();
    }
    
    
    public ArrayList<VitalSigns> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
    
    public VitalSigns addVitalSIgnsHistory(){
        VitalSigns sign = new VitalSigns();
        vitalSignsHistory.add(sign);
        return sign;
    }
    
}

