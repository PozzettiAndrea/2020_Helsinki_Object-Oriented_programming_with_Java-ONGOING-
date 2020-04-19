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

public class IOU {
    private HashMap<String,Double> howmuch;
    
    public IOU() {
        this.howmuch = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.howmuch.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        if (this.howmuch.containsKey(toWhom)) {
            return this.howmuch.get(toWhom);
        } else {
            return 0;
        }
        
    }
}
