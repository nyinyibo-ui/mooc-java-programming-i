/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
public class Container {

    int contains;
    int maxAmount;

    //Constructor
    public Container() {
        this.contains = 0;
        this.maxAmount = 100;
    }

    public int contains() {
        return this.contains;
    }

    public void add(int amount) {
        if (amount < 0) {
            this.contains += 0;
        } else if (this.contains + amount > maxAmount) {
            this.contains = 100;
        } else {
            this.contains += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            this.contains -= 0;
        } else if (this.contains - amount < 0) {
            this.contains = 0;
        } else {
            this.contains -= amount;
        }
    }

    //move the liquid to another container;
    public void move(Container second, int amount) {
        if ((this.contains-amount)>0){
            this.remove(amount);
            second.add(amount);
        }else{
            int moveBuffer=this.contains();
            this.remove(amount);
            second.add(moveBuffer);
        }
        
    }

    public String toString() {
        return this.contains + "/" + this.maxAmount;
    }
}
