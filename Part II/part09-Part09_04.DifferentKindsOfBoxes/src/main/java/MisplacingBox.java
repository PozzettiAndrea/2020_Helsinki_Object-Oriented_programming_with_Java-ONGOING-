
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class MisplacingBox extends Box {
    private ArrayList<Item> box;
    
    public MisplacingBox() {
        super();
        this.box = new ArrayList<>();
    }
    
   
    public void add(Item item) {
        this.box.add(item);
    }
    
    public boolean isInBox(Item item) {
        return false;
    }
}
