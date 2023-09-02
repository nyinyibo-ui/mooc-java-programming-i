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
    
    
    public RecipeRegister(){
        this.recipeList=new ArrayList<>();
    }
    
    public ArrayList<Recipe> getRecipeList(){
        return this.recipeList;
    }
    
    public void addRecipe(Recipe recipe){
        this.recipeList.add(recipe);
    }
    
}
