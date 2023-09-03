/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author alexe
 */
public class RecipeRegister {

    private ArrayList<Recipe> recipeList;

    public RecipeRegister() {
        this.recipeList = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipeList.add(recipe);
    }

    public ArrayList<Recipe> getRecipeList() {
        return this.recipeList;
    }

    // find the recipe by its name 
    public ArrayList<Recipe> findByName(String word) {
        // create a arrayList to add the founded recipe
        ArrayList<Recipe> foundList = new ArrayList<>();
        // if the searched word contains in a recipe name add it to the array list created
        for (Recipe recipe : this.recipeList) {
            if (recipe.getName().contains(word)) {
                foundList.add(recipe);
            }
        }
        return foundList;
    }

    // find the recipe by cooking time less than the max time given in paranthesis
    public ArrayList<Recipe> findByCookingTime(int maxTime) {
        // create a arrayList to add the founded recipe
        ArrayList<Recipe> foundList = new ArrayList<>();

        // if the duration of the recipe is less than or equal to the max time given add it to the list
        for (Recipe recipe : this.recipeList) {
            if (recipe.getDuration() <= maxTime) {
                foundList.add(recipe);
            }
        }

        return foundList;
    }

    // find the recipe by ingredients name 
    public ArrayList<Recipe> findByIngredients(String name) {
        // create a arrayList to add the founded recipe
        ArrayList<Recipe> foundList = new ArrayList<>();
        
        
        for(Recipe recipe: this.recipeList){
            if(recipe.foundIngredients(name)){
                foundList.add(recipe);
            }
        }
        
        return foundList;
    }
}
