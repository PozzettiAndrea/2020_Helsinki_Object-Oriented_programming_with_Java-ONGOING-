
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {



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
        
        double average = inputs.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .average()
        .getAsDouble();
        
        System.out.println("average of the numbers: " + average);


}

    }
}
