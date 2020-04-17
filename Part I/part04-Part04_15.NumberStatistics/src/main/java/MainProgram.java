
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticseven = new Statistics();
        Statistics statisticsodd = new Statistics();
        while (true) {
            System.out.println("Enter numbers: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1){
                break;
            }
            if (num%2==0){
                statistics.addNumber(num);
                statisticseven.addNumber(num);
            } else {
                statistics.addNumber(num);
                statisticsodd.addNumber(num);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticseven.sum());
        System.out.println("Sum of odd numbers: " + statisticsodd.sum());
    }
}
