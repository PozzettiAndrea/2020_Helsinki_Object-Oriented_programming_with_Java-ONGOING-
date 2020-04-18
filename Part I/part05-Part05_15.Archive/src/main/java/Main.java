
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {            
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Item item = new Item(identifier,name);
            items.add(item);
        }
        ArrayList<Item> printeditems = new ArrayList<>();
        
        for (Item iteminlist:items) {
            boolean inlist = false;
            for (Item printeditem:printeditems) {
                if (iteminlist.equals(printeditem)) {
                    inlist = true;
                }
            }
            if (inlist == false) {
                System.out.println(iteminlist.getIdentifier() + ": " + iteminlist.getName());
                printeditems.add(iteminlist);
            }
        }
    }
}
