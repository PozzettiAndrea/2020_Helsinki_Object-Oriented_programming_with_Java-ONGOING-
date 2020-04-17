import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            TelevisionProgram tvp = new TelevisionProgram(name,duration);
            infoCollection.add(tvp);            
        }
        System.out.println("\nProgram's maximum duration?");
        int maxdur = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram tvp:infoCollection) {
            if (tvp.getDuration() <= maxdur) {
                System.out.println(tvp.getName() + ", " + tvp.getDuration() + " minutes");
            }
        }
    }
}
