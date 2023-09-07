/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.*;

public class BirdRegister {

    private ArrayList<Bird> listOfBirds;

    public BirdRegister() {
        this.listOfBirds = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        this.listOfBirds.add(bird);
    }

    public ArrayList<Bird> getList() {
        return this.listOfBirds;
    }

    public boolean observeBird(String name) {
        boolean found = false;
        for (Bird bird : listOfBirds) {
            if (bird.getName().equals(name)) {
                bird.observe();
                found = true;
                break;
            }
        }
        return found;

    }
    
 
}
