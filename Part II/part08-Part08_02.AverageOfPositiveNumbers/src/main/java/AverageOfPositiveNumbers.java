import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numofnums = 0;
        int sumofnums = 0;
        boolean onepositive = false;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            } else if (num > 0){
                onepositive = true;
                sumofnums += num;
                numofnums += 1;
            }
        }
        if (onepositive == false){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + (1.0*sumofnums/numofnums));
        }
    }
}