
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> itemz = new ArrayList<>();
        while (true){
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            Item item = new Item(name);
            itemz.add(item);
        }
        for (Item item:itemz) {
            System.out.println(item);
        }

    }
}
