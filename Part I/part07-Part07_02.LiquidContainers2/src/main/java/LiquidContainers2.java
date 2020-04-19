
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        System.out.println("First: " + first);
                System.out.println("Second: " + second);

        while (true) {
            System.out.print("> ");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else if (input.contains("add")) {
                String[] command = input.split(" ");
                int amount = Integer.valueOf(command[1]);
                first.add(amount);
                System.out.println("First: " + first);
                System.out.println("Second: " + second);
            } else if (input.contains("remove")) {
                String[] command = input.split(" ");
                int amount = Integer.valueOf(command[1]);
                second.remove(amount);
                System.out.println("First: " + first);
                System.out.println("Second: " + second);
            } else if (input.contains("move")) {
                String[] command = input.split(" ");
                int amount = Integer.valueOf(command[1]);
                if (first.contains() > amount) {
                    first.remove(amount);
                    second.add(amount);
                } else {
                    second.add(first.contains());
                    first.remove(amount);
                }

                System.out.println("First: " + first);
                System.out.println("Second: " + second);
            }
        }
    }
}
