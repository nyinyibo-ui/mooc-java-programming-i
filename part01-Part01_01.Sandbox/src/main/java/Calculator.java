/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
public class Calculator {
    private int value;
    
    public Calculator(){
        this.value=0;
    }
    
    public void add(int number){
        this.value+=number;
    }
    
    public void substract(int number){
        this.value-=number;
    }
    
    public int getValue(){
        return this.value;
    }
}
