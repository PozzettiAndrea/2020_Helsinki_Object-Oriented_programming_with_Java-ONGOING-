
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        String target = scanner.nextLine();
        int isthere = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)){
                isthere = 1;
            }
        }
        if (isthere == 1) {
            System.out.println(target + " was found!");
        } else {
            System.out.println(target + " was not found!");
        }
    }
}
