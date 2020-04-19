/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */

import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate,String> register;
    
    public VehicleRegistry() {
        this.register = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if (!this.register.containsKey(licensePlate)) {
            this.register.put(licensePlate,owner);
            return true;
        } else {
            return false;
        }
        
    }
    
    public String get(LicensePlate licensePlate) {
        return this.register.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.register.containsKey(licensePlate)) {
            this.register.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printLicensePlates() {
        for (LicensePlate license:this.register.keySet()) {
            System.out.println(license);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownersprinted = new ArrayList<>();
        
        for (String owner:this.register.values()) {
            if (!ownersprinted.contains(owner)){
                System.out.println(owner);
                ownersprinted.add(owner);
            }
        }
    }
}
