
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("")) {
                break;
            }
            else lines.add(row);
            
        }
        lines.stream()
                .forEach(line -> System.out.println(line));
    }
}
