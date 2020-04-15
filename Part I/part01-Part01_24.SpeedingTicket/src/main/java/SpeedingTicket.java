
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int speed = Integer.valueOf(scanner.nextLine());
        if (speed > 120) {
        System.out.println("Speeding ticket!");
        }
    }
}
