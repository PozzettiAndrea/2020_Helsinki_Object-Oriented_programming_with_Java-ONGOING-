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

public class Hold {
    private int maxweight;
    private int weightleft;
    private ArrayList<Suitcase> scases;
    
    public Hold(int mweight) {
        this.maxweight = mweight;
        this.scases = new ArrayList<>();
        this.weightleft = mweight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() <= weightleft) {
            this.scases.add(suitcase);
            this.weightleft -= suitcase.totalWeight();
        }
    }
    
    public int totalWeight() {
        return (this.maxweight - this.weightleft);
    }
    
    public String toString() {
        return this.scases.size() + " suitcases ("+ this.totalWeight() +" kg)";
    }
    
    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase suitcase:this.scases) {
                for (Item item:suitcase.getItems()) {
                System.out.println(item);
            }
        }
    }
}
