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
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Commands:\n" +
            "1 - add a joke\n" +
            "2 - draw a joke\n" +
            "3 - list jokes\n" +
            "X - stop");
            
            String input = scanner.nextLine();
            if (input.equals("X")) {
                break;
            } else if (input.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joketobeadded = scanner.nextLine();
                this.jokeManager.addJoke(input);
            } else if (input.equals("2")) {
                this.jokeManager.drawJoke();
            } else if (input.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();
            }
        }
    }
}
