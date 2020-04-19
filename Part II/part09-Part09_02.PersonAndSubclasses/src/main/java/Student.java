/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */

public class Student extends Person {

    private int credits = 0;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public void study() {
        this.credits += 1;
    }
    
    public int credits() {
        return this.credits;
    }
    
    @Override
    public String toString() {
        return (this.name() + "\n" +
        "  " + this.address() + "\n" +
        "  Study credits " + this.credits());
    }
}

