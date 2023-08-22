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
public class Stack {
    private ArrayList<String> stack;
    
    public Stack(){
        this.stack=new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.stack.isEmpty();
    }
    
    public void add(String value){
        this.stack.add(value);
    }
    
    public ArrayList<String> values (){
        return this.stack;
    }
    
    // returns the topmost value (i.e., the last value added to the deque) and removes it from the stack.
    public String take(){
        String value=this.stack.get(this.stack.size()-1);
        this.stack.remove(this.stack.size()-1);
        return value;
    }
}
