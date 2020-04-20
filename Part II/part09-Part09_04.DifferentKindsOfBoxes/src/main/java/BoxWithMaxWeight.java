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

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> box;
    
    public BoxWithMaxWeight(int capacity) {
        super();
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }
    
   
    public void add(Item item) {
        if ((item.getWeight() <= capacity)) {
            this.box.add(item);
            this.capacity -= item.getWeight();
        }
    }
    
    public boolean isInBox(Item item) {
        return this.box.contains(item);
    }
}
