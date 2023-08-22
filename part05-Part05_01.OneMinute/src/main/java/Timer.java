/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
public class Timer {

    private ClockHand miliSeconds;
    private ClockHand seconds;

    public Timer() {
        // for miliseconds hand
        this.miliSeconds = new ClockHand(100);
        //for secons hand
        this.seconds = new ClockHand(60);

    }

    public void advance() {

        // advance milisecond by one
        this.miliSeconds.advance();

        if (miliSeconds.value() == 0) {
            //advance secons by one if milisecond reached its limit
            seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.miliSeconds;
    }
}
