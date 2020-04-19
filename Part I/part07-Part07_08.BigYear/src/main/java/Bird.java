/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class Bird {
    private String name;
    private String latin;
    private int spotted;
    
    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.spotted = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void spotted() {
        this.spotted += 1;
    }
    
    public String toString() {
        return this.name + " (" + this.latin + "): " + this.spotted + " observations";
    }
}
