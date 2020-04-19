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

public class BirdRegister {
    private ArrayList<Bird> birbs;
    
    public BirdRegister(){
        this.birbs = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        this.birbs.add(bird);
    }
    
    public ArrayList<Bird> getList() {
        return this.birbs;
    }
    
    public void all(){
        for (Bird bird:birbs) {
            System.out.println(bird);
        }
    }
    
}
