/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class Container {
    private int level;
    
    public Container(){
        this.level = 0;
    }
    
    public int contains() {
        return this.level;
    }
    
    public void add(int amount) {
        if (amount >= 0) {
            this.level += amount;
            if (this.level > 100) {
                this.level = 100;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount >= 0) {
            this.level -= amount;
            if (this.level < 0) {
                this.level = 0;
            }
        }
    }
    
    public String toString() {
        return this.level +"/100";
    }
}
