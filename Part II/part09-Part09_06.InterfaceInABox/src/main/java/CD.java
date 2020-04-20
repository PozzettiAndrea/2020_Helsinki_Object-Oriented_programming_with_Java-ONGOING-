/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class CD implements Packable{
    private String author;
    private String name;
    private int pubYear;
    
    public CD(String author, String name, int pubYear) {
        this.name = name;
        this.author = author;
        this.pubYear = pubYear;
    }
    
    public double weight() {
        return 0.1;
    }
    
    public String toString() {
        return this.author + ": " + this.name + " (" +this.pubYear+")";
    }
}
