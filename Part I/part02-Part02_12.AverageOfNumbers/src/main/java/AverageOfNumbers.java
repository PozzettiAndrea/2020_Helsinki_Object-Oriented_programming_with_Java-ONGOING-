
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numofnums = 0;
        int sumofnums = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            } else{
                sumofnums += num;
                numofnums += 1;
            }
        }
        System.out.println("Average of the numbers: " + (1.0*sumofnums/numofnums));


    }
}
