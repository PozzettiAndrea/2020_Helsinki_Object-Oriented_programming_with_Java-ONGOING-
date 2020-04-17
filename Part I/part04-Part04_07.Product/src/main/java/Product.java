/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class Product {
    private double price;
    private String initialName;
    private int initialQuantity;
    public Product(String initialName, double initialPrice, int initialQuantity) {
    this.price = initialPrice;
    this.initialName = initialName;
    this.initialQuantity = initialQuantity;
    }
    public void printProduct() {
    System.out.println(initialName + ", price " + price + ", "+ initialQuantity +" pcs");
    }
}
