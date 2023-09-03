/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author alexe
 */
public class Recipe {
    private String name;
    private int duration;
    private ArrayList<String> ingredients;
    
    //constructor
    public Recipe(String name,int duration){
        this.name=name;
        this.duration=duration;
        this.ingredients=new ArrayList<>();
    }
    
    public void addIngredients(String ingredient){
        this.ingredients.add(ingredient);
    }
    public String getName(){
        return this.name;
    }
    
    public int getDuration(){
        return this.duration;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    public String toString(){
        return this.name+", cooking time: "+this.duration;
    }
    
    public boolean foundIngredients(String word){
        for (String ingredient: this.ingredients){
            if (ingredient.equals(word)){
                return true;
            }
        }
        return false;
    }
    
}


