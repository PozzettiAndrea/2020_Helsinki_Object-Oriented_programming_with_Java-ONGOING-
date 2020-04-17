
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int total = 0;
        String longestname = "";
        while (true) {
            String text = scanner.nextLine();
            if (text.length() == 0){
                break;
            }
            String[] pieces = text.split(",");
            if (pieces[0].length() > longestname.length()) {
                longestname = pieces[0];
            }
            sum+=Integer.valueOf(pieces[1]);
            total += 1;
        }
        System.out.println("Longest name: " + longestname);
        System.out.println("Average of the birth years: " + (1.0*sum/total));

    }
}
