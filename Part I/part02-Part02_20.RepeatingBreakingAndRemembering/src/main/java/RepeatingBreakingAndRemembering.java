
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int numofnums = 0;
        int sumofnums = 0;
        int numofevens = 0;
        int numofodds = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            } else {
                sumofnums += num;
                numofnums += 1;
                if (num%2==0){
                    numofevens += 1;
                } else {
                    numofodds += 1;
                }
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sumofnums);
        System.out.println("Numbers: " + numofnums);
        System.out.println("Average: " + (1.0 * sumofnums / numofnums));
        System.out.println("Even: " + numofevens);
        System.out.println("Odd: " + numofodds);
    }
}
