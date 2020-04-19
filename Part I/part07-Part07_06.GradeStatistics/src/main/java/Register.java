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
import java.util.Arrays;

public class Register {
    private ArrayList<Integer> register;
    private ArrayList<Integer> registerPass;
    
    public Register() {
        this.register = new ArrayList<>();
        this.registerPass = new ArrayList<>();
    }
    
    public void add(int grade) {
        if (grade>=0 && grade <= 100){
            this.register.add(grade);
        }
        if (grade>=50 && grade <= 100){
            this.registerPass.add(grade);
        }
    }
        
    public double average() {
        int sum = 0;
        for (int grade:this.register)  {
            sum += grade;
        }
        return (1.0*sum/this.register.size());
    }
    
    public double averagePassing() {
        if (this.registerPass.size() == 0) {
            return -1;
        } else {
            int sum = 0;
            for (int grade:this.registerPass)  {
                sum += grade;
            }
            return (1.0*sum/this.registerPass.size());
        }
    }
    
    public double passPercentage() {
        return (100*1.0*this.registerPass.size()/this.register.size());
    }
    
    public static int pointsToGrade(int points) {
        int grade;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public int[] gradeDistribution() {
        int[] distribution = new int[6];
        for (int points:this.register) {
            distribution[this.pointsToGrade(points)] += 1;
        }
        return distribution;
    }
}
