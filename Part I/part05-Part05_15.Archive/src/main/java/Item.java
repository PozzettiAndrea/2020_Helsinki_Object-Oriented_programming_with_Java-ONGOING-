/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class Item {
    private String name;
    private String identifier;

    public Item(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }
    
    public boolean equals(Item item) {
        if (this.identifier.equals(item.identifier)) {
            return true;
        } else {
            return false;
        }
    }
}
