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

public class UserInterface {
    private Scanner scanner;
    private TodoList todo;
    
    
    
    public UserInterface(TodoList todo, Scanner scanner) {
        this.scanner = scanner;
        this.todo = todo;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            if (command.equals("stop")){
                break;
            } else if (command.equals("add")) {
                System.out.println("To add:");
                String tasktoadd = this.scanner.nextLine();
                this.todo.add(tasktoadd);
            } else if (command.equals("list")){
                this.todo.print();
            } else if (command.equals("remove")) {
                System.out.println("To add:");
                int tasktoremove = Integer.valueOf(this.scanner.nextLine());
                this.todo.remove(tasktoremove);
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
