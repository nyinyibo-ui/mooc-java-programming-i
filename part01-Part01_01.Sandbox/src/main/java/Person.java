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
    private int year;
    
    public Person(String initialName){
        this(initialName,1996);
    }
    
    public Person(String initialName,int initialYear){
        this.year=initialYear;
        this.name=initialName;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public void setYear(int setYear){
        this.year=setYear;
    }
    public String toString(){
        return this.name+" is in the year "+this.year;
    }
}