
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yz
 */
public class UserInterface {

    private RecipeBox recipeBox;
    private Scanner scan;

    public UserInterface(Scanner scan) {
        this.recipeBox = new RecipeBox();
        this.scan = scan;
    }

    public void start() {
        System.out.println("File to read:");
        String fileName = this.scan.nextLine();
        String command;

        this.RecipeBoxPopulator(fileName);

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient\n");

        while (true) {
            System.out.println("Enter command");
            command = this.scan.nextLine();
            if (command.equals("stop")) {
                break;
            }
            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("list")) {
            this.recipeBox.listRecipes();
        }
        if (command.equals("find cooking time")) {
            int cookingTime = Integer.valueOf(this.scan.nextLine());
            this.recipeBox.searchTime(cookingTime);
        }
        if (command.equals("find name")) {
            String name = this.scan.nextLine();
            this.recipeBox.searchRecipe(name);
        }
        if (command.equals("find ingredient")) {
            String ingredient = this.scan.nextLine();
            this.recipeBox.searchIngredient(ingredient);
        }
    }

    public void RecipeBoxPopulator(String fileName) {
        ArrayList<String> tempRecipe = new ArrayList<>();
        try (Scanner fileRead = new Scanner(Paths.get(fileName))) {
            while (fileRead.hasNextLine()) {
                String temp = fileRead.nextLine();
                if (temp.isEmpty()) {
                    ArrayList<String> ingredients = new ArrayList<String>(tempRecipe.subList(2, tempRecipe.size()));
                    this.recipeBox.addRecipe(tempRecipe.get(0), Integer.valueOf(tempRecipe.get(1)), ingredients);
                    tempRecipe.clear();
                    continue;
                }
                tempRecipe.add(temp);
            }
            
            ArrayList<String> ingredients = new ArrayList<String>(tempRecipe.subList(2, tempRecipe.size()));
            this.recipeBox.addRecipe(tempRecipe.get(0), Integer.valueOf(tempRecipe.get(1)), ingredients);
            tempRecipe.clear();
            
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("File not found!");
        }
    }

}
