
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringy = "yes";
        while (!stringy.equals("no")){
            System.out.println("Carry on?");
            stringy = scanner.nextLine();
        }

    }
}
