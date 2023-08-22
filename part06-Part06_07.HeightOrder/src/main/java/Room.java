/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.ArrayList;
public class Room {
    private ArrayList<Person> persons;
    
    //constructor
    public Room(){
        this.persons=new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        return this.persons.isEmpty();
    }
    
    public ArrayList <Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        // if the list is empty return null
        if (this.persons.isEmpty()){
            return null;
        }
        
        // preset the limit as the first person in the lists
        Person shortestPerson=this.persons.get(0);
        
        // run the loop and read individual person in the list
        for (Person prs:persons){
            // if the current person height is shortet than the limit set it's height as a new limit
            if (shortestPerson.getHeight()>prs.getHeight()){
                shortestPerson=prs;
            }
        }
        return shortestPerson;
        
    }
    
    public Person take(){
        // if the list is empty return null;
        if (this.persons.isEmpty()){
            return null;
        }
        
        // take the shortest person
        Person taken=this.shortest();
        
        // remove it from the list by it's index
        this.persons.remove(this.persons.indexOf(taken));
        return taken;
    }
}
