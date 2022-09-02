
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yz
 */
public class RecipeBox {

    private ArrayList<Recipe> recipes;

    public RecipeBox() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(String name, int cookingTime, ArrayList<String> ingredients) {
        Recipe tempRecipe = new Recipe(name, cookingTime, ingredients);
        this.recipes.add(tempRecipe);
    }

    public void listRecipes() {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }

    public void searchRecipe(String word) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe);
            }
        }
    }

    public void searchTime(int maxTime) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }

    public void searchIngredient(String ingredient) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (Recipe recipe : this.recipes) {
            output += recipe.toString() + "\n";
        }
        return output;
    }
}
