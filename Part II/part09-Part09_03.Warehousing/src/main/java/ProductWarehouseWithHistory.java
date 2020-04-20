/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName,capacity);
        this.history = new ChangeHistory();
        this.setBalance(initialBalance);
        this.history.add(this.getBalance());
    }
    
    public String history() {
        return this.history.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(this.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double tbr = super.takeFromWarehouse(amount);
        this.history.add(this.getBalance());
        return tbr;
    }
    
    public void printAnalysis() {
        System.out.println("Product: "+this.getName()+"\n" +
        "History: "+this.history()+"\n" +
        "Largest amount of product: "+history.maxValue()+"\n" +
        "Smallest amount of product: "+history.minValue()+"\n" +
        "Average: "+history.average()+"\n");
    }
}
