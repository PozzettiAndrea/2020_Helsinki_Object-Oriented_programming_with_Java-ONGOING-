
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        
        System.out.println("First: "+ first +"/100");
        System.out.println("Second: "+ second +"/100");
        
        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else if (input.contains("add")) {
                String[] command = input.split(" ");
                int amount = Integer.valueOf(command[1]);
                if (amount >= 0){
                    first += amount;
                    if (first > 100) {
                        first = 100;
                    }
                }
                System.out.println("First: "+ first +"/100");
                System.out.println("Second: "+ second +"/100");
            } else if (input.contains("remove")) {
                String[] command = input.split(" ");
                int amount = Integer.valueOf(command[1]);
                if (amount>=0){
                    if (amount>second) {
                        second = 0;
                    } else {
                        second -= amount;
                    }
                }
                
                System.out.println("First: "+ first +"/100");
                System.out.println("Second: "+ second +"/100");
            } else if (input.contains("move")) {
                String[] command = input.split(" ");
                int amount = Integer.valueOf(command[1]);
                
                if (amount >= 0) {
                    if (amount > first) {
                        amount = first;
                        first = 0;
                    } else {
                        first -= amount;
                    }

                    second += amount;
                    if (second > 100) {
                        second = 100;
                    }
                }
                
                
                System.out.println("First: "+ first +"/100");
                System.out.println("Second: "+ second +"/100");
            }

        }
    }

}
