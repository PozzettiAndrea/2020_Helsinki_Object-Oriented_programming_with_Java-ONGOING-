/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    
    
    
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            if (command.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                System.out.println("Translation:");
                String translation = this.scanner.nextLine();
                this.dict.add(word,translation);
            } else if (command.equals("search")){
                System.out.println("To be translated:");
                String tbt = this.scanner.nextLine();
                if (dict.translate(tbt) == null){
                    System.out.println("Word "+tbt+" was not found");
                } else {
                    System.out.println("Translation:" + dict.translate(tbt));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
}
