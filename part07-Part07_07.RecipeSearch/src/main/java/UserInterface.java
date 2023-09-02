/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.*;

public class UserInterface {

    private Scanner scanner;
    private RecipeRegister register;

    //constructor
    public UserInterface(Scanner scanner, RecipeRegister register) {
        this.scanner = scanner;
        this.register = register;
    }

    // starting the interface
    public void start() {
        readFile();
        System.out.println("");
        printCommand();
        System.out.println("");
        readCommand();
    }

    // reading file input
    public void readFile() {

        System.out.println("File to read: ");
        String file = scanner.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read first line and it is the recipe name
                String recipeName = scanner.nextLine();
                // second line is the cooking time
                int cookingTime = Integer.valueOf(scanner.nextLine());
                // we create a recipe object
                Recipe recipe = new Recipe(recipeName, cookingTime);

                // reading the ingredients until an empty row
                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredients(ingredient);
                }

                // add the recipe into a recipe register object
                register.addRecipe(recipe);

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // printing commands options
    public void printCommand() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("stop - stops the program");
    }

    // read command from the user
    public void readCommand() {

        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")){
                break;
            }// initiate list command
            else  if (command.equals("list")) {
                list();
            }
        }
        System.out.println("");

    }

    // command list
    public void list() {
        System.out.println("Rcipes:");
        for (Recipe recipe : register.getRecipeList()) {
            System.out.println(recipe);
        }
    }

}
