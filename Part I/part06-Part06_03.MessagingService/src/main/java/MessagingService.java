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


public class MessagingService {
    
    private ArrayList<Message> mexservice;
    
    public MessagingService() {
        this.mexservice = new ArrayList<>();
    }
    
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            mexservice.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return mexservice;
    }
}
