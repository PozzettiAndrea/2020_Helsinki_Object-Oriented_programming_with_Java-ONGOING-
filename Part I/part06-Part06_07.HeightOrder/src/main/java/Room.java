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

public class Room {
    private ArrayList<Person> room;
    
    public Room() {
        this.room = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.room.add(person);
    }
    
    public boolean isEmpty() {
        return this.room.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.room;
    }
    
    public Person shortest() {
        int shortestindex = 0;
        if (this.room.size()==0) {
            return null;
        } else {
            for (int i = 0; i<room.size();i++) {
                if (this.room.get(i).getHeight() < room.get(shortestindex).getHeight()) {
                    shortestindex = i;
                }
            }
        }
        return this.room.get(shortestindex);
    }
    
    public Person take(){
        if (this.room.size()==0) {
            return null;
        } else {
            Person toreturn = this.shortest();
            this.room.remove(toreturn);
            return toreturn;
        }
    }
}
