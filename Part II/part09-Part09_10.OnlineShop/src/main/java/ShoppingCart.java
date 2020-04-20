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
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }
    
    public void add(String product, int price) {
        if (items.contains(new Item(product, 1, price))){
            for (Item item:items) {
                if (item.getName() == product) {
                    item.increaseQuantity();
                }
            }
        } else {
            this.items.add(new Item(product, 1, price));
        }
    }
    
    public int price() {
        int sum = 0;
        for (Item item:items) {
            sum += item.price();
        }
        return sum;
    }
    
    public void print() {
        for (Item item:items) {
            System.out.println(item);
        }
    }
}
