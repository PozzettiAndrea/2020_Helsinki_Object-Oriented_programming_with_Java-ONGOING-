
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {


    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
        String row = scanner.nextLine();
        if (row.equals("end")) {
            break;
        }

        inputs.add(row);
        
        }
        
        double average = 0;
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        if (choice.equals("n")) {
            average = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number -> number < 0)
            .average()
            .getAsDouble();
        } else if (choice.equals("p")) {
            average = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number -> number > 0)
            .average()
            .getAsDouble();
        }
        
        
        
        System.out.println("average of the numbers: " + average);
    }
}
