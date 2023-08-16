/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
public class TimeTravel {
    private Person person;
    
    public TimeTravel(Person person){
        this.person=person;
        
    }
    
    public void travelInTime(int years){
        this.person.setYear(this.person.getYear()+years);
                
    }
    
}
