
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */

public class Item {
    private String name;
    private int qty;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice) {
        this.name = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return this.qty*this.unitPrice;
    }
    
    public void increaseQuantity() {
        this.qty += 1;
    }
    
    public String toString() {
        return this.name + ": " + this.qty;
    }
    
    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}
