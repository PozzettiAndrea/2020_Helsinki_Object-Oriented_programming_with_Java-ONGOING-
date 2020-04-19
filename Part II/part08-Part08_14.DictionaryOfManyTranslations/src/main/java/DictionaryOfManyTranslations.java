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
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String,ArrayList<String>> dict;
    
    public DictionaryOfManyTranslations() {
        this.dict = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        if (dict.containsKey(word)) {
            dict.get(word).add(translation);
        } else {
            dict.put(word,new ArrayList<>());
            dict.get(word).add(translation);
        }
    }
    
    public ArrayList<String> translate(String word) {
        if (dict.containsKey(word)) {
            return dict.get(word);
        } else {
            return new ArrayList<>();
        }
    }
    
    public void remove(String word) {
        if (dict.containsKey(word)) {
            this.dict.remove(word);
        }
    }
}
