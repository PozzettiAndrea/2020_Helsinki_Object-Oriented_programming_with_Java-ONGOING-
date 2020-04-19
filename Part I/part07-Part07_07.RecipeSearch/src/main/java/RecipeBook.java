/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */

import java.util.ArrayList;

public class RecipeBook {
    private ArrayList<Recipe> recipes;
    
    public RecipeBook(){
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public void list() {
        System.out.println("\nRecipes:");
        for (Recipe recipe:recipes) {
            System.out.println(recipe);
        }
        System.out.println("");
    }
    
    public void listByName(String name) {
        System.out.println("\nRecipes:");
        for (Recipe recipe:recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }
    
    public void listByTime(int cTime) {
        System.out.println("\nRecipes:");
        for (Recipe recipe:recipes) {
            if (recipe.getCookingTime() <= cTime) {
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }
    
    public void listByIngredient(String ingredient) {
        System.out.println("\nRecipes:");
        for (Recipe recipe:recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }
}
