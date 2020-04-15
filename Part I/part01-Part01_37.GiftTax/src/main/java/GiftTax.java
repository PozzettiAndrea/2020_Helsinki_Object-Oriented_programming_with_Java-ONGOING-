
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value <= 25000) {
            double tax = 100 + 0.08*(value-5000);
            System.out.println("Tax:" + tax);
        } else if (value <= 55000) {
            double tax = 1700 + 0.1*(value-25000);
            System.out.println("Tax:" + tax);
        } else if (value <= 200000) {
            double tax = 4700 + 0.12*(value-55000);
            System.out.println("Tax:" + tax);
        } else if (value <= 1000000) {
            double tax = 22100 + 0.15*(value-200000);
            System.out.println("Tax:" + tax);
        } else if (value >= 1000000) {
            double tax = 142100 + 0.17*(value-1000000);
            System.out.println("Tax:" + tax);
        }

    }
}
