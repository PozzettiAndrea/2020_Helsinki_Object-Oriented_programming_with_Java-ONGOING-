
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
public class OneItemBox extends Box{
    private ArrayList<Item> inbox;
    
    public OneItemBox() {
        super();
        this.inbox = new ArrayList<>();
    }
    
    public void add(Item item) {
        if (this.inbox.size()==0) {
            this.inbox.add(item);
        }
    }
    
    public Item getItem() {
        return this.inbox.get(0);
    }
    
    @Override
    public boolean isInBox(Item item) {
        if (this.inbox.size()==1) {
            return (this.inbox.get(0).equals(item));
        } else {
            return false;
        }
    }
}
