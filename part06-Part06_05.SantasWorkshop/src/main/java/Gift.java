/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
public class Gift {
    private String name;
    private int weight;
    
    // Constructor
    public Gift(String giftName,int giftWeight){
        this.name=giftName;
        this.weight=giftWeight;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public String toString(){
        return this.name+"("+this.weight+" kg)";
    }
    
    
    
}
