
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String stringy = scan.nextLine();
        System.out.println("Give an integer:");
        int inty = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double doubly = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean booly = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+ stringy +"\nYou gave the integer "+ inty +"\n" +
        "You gave the double "+ doubly +"\n" +
        "You gave the boolean "+ booly);

    }
}
