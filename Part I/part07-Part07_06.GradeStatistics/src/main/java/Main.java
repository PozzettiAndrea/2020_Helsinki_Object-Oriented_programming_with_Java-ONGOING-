
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Register register = new Register();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;
            }
            register.add(points);
        }
        System.out.println("Point average (all): " + register.average());
        if (register.averagePassing() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + register.averagePassing());
        }
        System.out.println("Pass percentage: " + register.passPercentage());
        int [] distribution = register.gradeDistribution();
        System.out.println("Grade distribution:");
        for (int i = 5; i>=0; i--) {
            System.out.print(i + ": ");
            for (int b = 0; b < distribution[i]; b++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
