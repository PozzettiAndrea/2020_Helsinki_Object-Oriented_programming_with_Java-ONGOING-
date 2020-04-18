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

public class Package {
    private ArrayList<Gift> pack;
    
    public Package() {
        this.pack = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        pack.add(gift);
    }
    public int totalWeight() {
        int sum = 0;
        for (Gift item:pack) {
            sum += item.getWeight();
        }
        return sum;
    }
}
