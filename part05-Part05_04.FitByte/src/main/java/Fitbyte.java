/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    // constructor 
    public Fitbyte(int age,int restingHeartRate){
        this.age=age;
        this.restingHeartRate=restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        // maximum heart rate formula 206.3 - (0.711 * age)       
        double maxHeartRate=206.3-(.711*this.age);
        /*
        The Karvonen method allows you to calculate your target heart rate for physical exercise.
        The target heart rate is calculated with the formula 
        (maximum heart rate - resting heart rate) * (target heart rate percentage) + resting heart rate, 
        where the target heart rate is given as a percentage of the maximum heart rate.
        */
        double result=(maxHeartRate-this.restingHeartRate)*(percentageOfMaximum)+this.restingHeartRate;
        return result;
    }
}
