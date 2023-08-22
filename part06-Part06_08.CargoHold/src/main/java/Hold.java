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

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase suitCase : suitcases) {
            total += suitCase.totalWeight();
        }
        return total;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public void printItems(){
        for(Suitcase suitcase: this.suitcases){
            suitcase.printItems();
        }
    }

    public String toString() {
        // if the list is empty 
        if (suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        // if there is only 1 item
        if (suitcases.size() == 1) {
            return this.suitcases.size() + " suitcase (" + this.totalWeight() + " kg)";

        }
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }


}
