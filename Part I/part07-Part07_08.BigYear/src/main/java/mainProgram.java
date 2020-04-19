
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        BirdRegister register = new BirdRegister();
        
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("?");
            String command = scan.nextLine();
            if (command.equals("Quit")){
                break;
            } else if (command.equals("Add")){
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latin = scan.nextLine();
                Bird bird = new Bird(name,latin);
                register.addBird(bird);
            } else if (command.equals("Observation")){
                System.out.println("Bird?");
                String spottedbird = scan.nextLine();
                for (Bird bird:register.getList()){
                    if (bird.getName().equals(spottedbird)){
                        bird.spotted();
                    }
                }
            } else if (command.equals("All")){
                register.all();
            } else if (command.equals("One")){
                System.out.println("Bird?");
                String desiredbird = scan.nextLine();
                for (Bird bird:register.getList()){
                    if (bird.getName().equals(desiredbird)){
                        System.out.println(bird);
                    }
                }
            }
        }
    }

}
