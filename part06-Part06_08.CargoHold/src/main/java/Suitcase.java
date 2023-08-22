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

public class Suitcase {

    private ArrayList<Item> items;
    private int maxTotalWeight;

    public Suitcase(int MaxWeightLimit) {
        this.items = new ArrayList<>();
        this.maxTotalWeight = MaxWeightLimit;
    }

    // to get current total weight in the suitcase
    public int totalWeight() {
        int total = 0;
        for (Item item : items) {
            total += item.getWeight();
        }
        return total;
    }

    public void addItem(Item item) {
        //ensure that the total weight of the items within it does not exceed the maximum weight limit
        if (this.totalWeight()+item.getWeight() <= this.maxTotalWeight) {
            this.items.add(item);
        }
    }
    
    public void printItems(){
        for (Item item:this.items){
            System.out.println(item);
        }
    }

    public Item     heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        
        //pre set the heaviest limit
        Item heaviestItem=this.items.get(0);
        for (Item item: this.items){
            if(item.getWeight()>heaviestItem.getWeight()){
                // re set the limit
                heaviestItem=item;
            }
        }
        return heaviestItem;
    }
    public String toString() {
        // if the list is empty 
        if (items.isEmpty()){
            return "no items (0 kg)";
        }
        
        // if there is only 1 item
        if (items.size()==1){
                    return this.items.size() + " item (" +this.totalWeight()+" kg)";

        }
        return this.items.size() + " items (" +this.totalWeight()+" kg)";
    }
}
