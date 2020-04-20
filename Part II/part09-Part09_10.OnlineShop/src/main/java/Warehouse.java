/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> instock;
    private Map<String, Integer> prices;
    
    
    public Warehouse() {
        this.prices = new HashMap<>();
        this.instock = new HashMap<>();
    }
    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.instock.put(product, stock);
    }
    
    public int price(String product) {
        if (this.instock.keySet().contains(product)) {
            return this.prices.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product) {
        if (this.instock.keySet().contains(product)) {
            return this.instock.get(product);
        } else {
            return 0;
        }
        
    }
    
    public boolean take(String product) {
        if (this.instock.keySet().contains(product)) {
            if (this.instock.get(product) >= 1) {
                this.instock.put(product, this.instock.get(product) - 1);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public Set<String> products() {
        return this.instock.keySet();
    }
}
