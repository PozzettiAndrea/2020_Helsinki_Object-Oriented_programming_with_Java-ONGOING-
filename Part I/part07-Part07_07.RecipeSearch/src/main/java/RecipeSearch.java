
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String file = scanner.nextLine();
               
        RecipeBook book = new RecipeBook();
        
        try ( Scanner fscanner = new Scanner(Paths.get(file))) {
            while (fscanner.hasNextLine()) {
                String name = fscanner.nextLine();
                int cookingTime = Integer.valueOf(fscanner.nextLine());
                Recipe newRecipe = new Recipe(name, cookingTime);
                while (fscanner.hasNextLine()) {
                    String ingredient = fscanner.nextLine();      
                    if (ingredient.equals("")) {
                        break;
                    } else {
                        newRecipe.addIngredient(ingredient);
                    }
                }
                book.addRecipe(newRecipe);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\nCommands:\n" +
            "list - lists the recipes\n" +
            "stop - stops the program\n" +
            "find name - searches recipes by name\n" +
            "find cooking time - searches recipes by cooking time\n" +
            "find ingredient - searches recipes by ingredient\n");
        
        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();

            if (command.equals("list")) {
                book.list();
            } else if (command.equals("stop")) {
                break;
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String name = scanner.nextLine();
                book.listByName(name);
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int cTime = Integer.valueOf(scanner.nextLine());
                book.listByTime(cTime);
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                book.listByIngredient(ingredient);
            }
        }
    }
}
