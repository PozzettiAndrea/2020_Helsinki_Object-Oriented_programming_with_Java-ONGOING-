/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String,ArrayList<String>> register;
    
    public StorageFacility() {
        this.register = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        if (register.containsKey(unit)) {
            register.get(unit).add(item);
        } else {
            register.put(unit,new ArrayList<>());
            register.get(unit).add(item);
        }
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (register.containsKey(storageUnit)) {
            return register.get(storageUnit);
        } else {
            return new ArrayList<>();
        }
    }
    
    public void remove(String storageUnit, String item) {
        if (register.containsKey(storageUnit)) {
            if (this.register.get(storageUnit).contains(item)) {
                this.register.get(storageUnit).remove(item);
            }
        }
        if (register.get(storageUnit).isEmpty()){
            register.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> tbt = new ArrayList<>();
        for (String su:register.keySet()) {
            tbt.add(su);
        }
        return tbt;
    }
}
