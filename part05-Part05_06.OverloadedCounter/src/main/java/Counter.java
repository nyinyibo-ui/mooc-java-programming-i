/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
public class Counter {

    private int counter;

    public Counter(int startValue) {
        this.counter = startValue;
    }

    //alternative counter constructor start at zero
    public Counter() {
        this(0);
    }

    public int value() {
        return this.counter;
    }

    // increase value by the number given
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.counter = this.counter + increaseBy;
        } else {
            // if the value is negative counter is unchanged;
            this.counter = this.counter + 0;
        }
    }

    // decrease value by the number given
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.counter = this.counter - decreaseBy;
        }else{
            this.counter=this.counter-0;
        }
    }

    //increase value by 1
    public void increase() {
        this.increase(1);
    }

    // decrease value by 
    public void decrease() {
        this.decrease(1);
    }

}
