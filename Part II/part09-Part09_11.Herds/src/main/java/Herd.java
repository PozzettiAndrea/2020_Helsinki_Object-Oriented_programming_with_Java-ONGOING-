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

public class Herd implements Movable{
    private ArrayList<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public String toString() {
        String toreturn = "";
        for (Movable org:this.herd) {
            toreturn += org + "\n";
        }
        return toreturn;
    }
    
    public void addToHerd(Movable mov) {
        this.herd.add(mov);
    }
    
    public void move(int dx, int dy) {
        for (Movable org:this.herd) {
            org.move(dx,dy);
        }
    }
}
