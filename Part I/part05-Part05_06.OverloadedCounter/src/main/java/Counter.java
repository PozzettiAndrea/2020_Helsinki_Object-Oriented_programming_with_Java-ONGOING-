/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class Counter {
    private int value;
 
    public Counter(int startvalue) {
        this.value = startvalue;
    }
    
    public Counter() {
        this.value = 0;
    }

    public void increase() {
        this.value += 1;
    }
    public void increase(int increaseBy) {
        if (increaseBy >=0){
           this.value += increaseBy; 
        }
    }

    public void decrease() {
        this.value -= 1;
    }
    public void decrease(int decreaseBy) {
        if (decreaseBy >=0){
           this.value -= decreaseBy; 
        }
    }
    public int value() {
        return value;
    }
}
