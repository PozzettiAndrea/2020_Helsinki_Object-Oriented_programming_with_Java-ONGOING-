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

public class Suitcase {
    private int maximumweight;
    private int spaceleft;
    private ArrayList<Item> items;
    
    public Suitcase(int mweight) {
        this.maximumweight = mweight;
        this.spaceleft = mweight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if (item.getWeight() <= spaceleft){
            this.items.add(item);
            this.spaceleft -= item.getWeight();
        }
    }
    
    public int totalWeight() {
        return (this.maximumweight-this.spaceleft);
    }
    
    public String toString() {
        if (this.items.size()== 0) {
            return "no items (0 kg)";
        } else if (this.items.size()== 1) {
            return this.items.size() + " item ("+this.totalWeight()+" kg)";
        } else {
            return items.size() + " items ("+ this.totalWeight()+" kg)";
        }
    }
    
    public void printItems() {
        System.out.println("The suitcase contains the following items:");
        for (Item item:this.items) {
            System.out.println(item);
        }
    }
    
    public ArrayList<Item> getItems() {
        return this.items;
    }
    
    public Item heaviestItem() {
        int heaviestindex = 0;
        if (this.items.size()==0) {
            return null;
        } else {
            for (int i = 0; i<this.items.size();i++) {
                if (this.items.get(i).getWeight() > this.items.get(heaviestindex).getWeight()) {
                    heaviestindex = i;
                }
            }
        }
        return this.items.get(heaviestindex);
    }
}
