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

public class Box implements Packable{
    private ArrayList<Packable> box;
    private double maxweight;
    
    public Box(double maxweight) {
        this.box = new ArrayList<>();
        this.maxweight = maxweight;
    }
    
    public void add(Packable packable){
        if (packable.weight() < maxweight) {
            box.add(packable);
            maxweight -= packable.weight();
        }
    }
    
    public double weight(){
        double sum = 0;
        for (Packable packable:box){
            sum += packable.weight();
        }
        return sum;
    }
    
    public String toString() {
        return "Box: "+box.size()+" items, total weight "+this.weight()+" kg";
    }
}
