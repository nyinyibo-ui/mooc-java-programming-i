
public class HealthStation {
    private int count;
    
    public HealthStation(){
        this.count=0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        count++;
        return person.getWeight();
    }
    
    //increase the weight of the parameter person by one.
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    
    // counting the number of weighings
    public int weighings(){
        return this.count;
    }
    
    
}
