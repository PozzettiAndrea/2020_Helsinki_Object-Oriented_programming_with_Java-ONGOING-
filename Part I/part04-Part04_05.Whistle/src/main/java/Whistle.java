/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class Whistle {
    private String verse;

    public Whistle(String verse) {
        this.verse = verse;
    }
    
    public void sound() {
        System.out.println(this.verse);
    }
}
