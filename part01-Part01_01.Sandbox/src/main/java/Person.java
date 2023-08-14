/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    
    public Person(String initialName){
        this.age=0;
        this.weight=0;
        this.height=0;
        this.name=initialName;
    }
    
    public void setHeight(int newHeight){
        this.height=newHeight;
    }
    
    public void setWeight(int newWeight){
        this.weight=newWeight;
    }
    
    public double bodyMassIndex(){
        double heightPerHundred=this.height/100.0;
        return this.weight/(heightPerHundred*heightPerHundred);
    }
    
    public String toString(){
        return  this.name+" age "+this.age+" years my body mass index is "+this.bodyMassIndex();
    }
}
