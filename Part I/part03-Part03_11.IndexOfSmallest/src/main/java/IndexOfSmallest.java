
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        
        int target = list.get(0);
        for (Integer num : list) {
            if (target > num){
                target = num;
            }
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target){
                list2.add(i);
            }
        }
        System.out.println("Smallest number: " + target);
        for (int i = 0; i < list2.size(); i++) {
            System.out.println("Found at index: " + list2.get(i));
        }
        
    }
}
