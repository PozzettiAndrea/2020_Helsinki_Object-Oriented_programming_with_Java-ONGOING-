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
import java.util.Collections;

public class ChangeHistory{
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {
        return Collections.max(history);
    }
    
    public double minValue() {
        return Collections.min(history);
    }
    public double average() {
        double sum = 0;
        for (Double value:history) {
            sum += value;
        }
        return sum/history.size();
    }
}
