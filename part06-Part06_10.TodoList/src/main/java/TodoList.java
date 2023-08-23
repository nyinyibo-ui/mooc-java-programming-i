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
public class TodoList {
    private ArrayList<String> toDoList;
    
    public TodoList(){
        toDoList=new ArrayList<>();
    }
    
    public void add(String task){
        toDoList.add(task);
    }
    
    public void print(){
        for(int index=0;index<toDoList.size();index++){
            System.out.println(index+1+": "+toDoList.get(index));
        }
    }
    
    public void remove(int number){
        toDoList.remove(number-1);
    }
}
