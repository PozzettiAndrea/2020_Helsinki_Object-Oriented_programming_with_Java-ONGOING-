
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String nameoftheoldest = "";
        while (true) {
            String text = scanner.nextLine();
            if (text.length() == 0){
                break;
            }
            String[] pieces = text.split(",");
            if (Integer.valueOf(pieces[1]) > oldest) {
                oldest = Integer.valueOf(pieces[1]);
                nameoftheoldest = pieces[0];
            }
        }
        System.out.println("Name of the oldest: "+ nameoftheoldest);

    }
}
