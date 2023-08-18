
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    
    public boolean equals(Object compared){
        // if the objectsr are in the same location return true
        if (this==compared){
            return true;
        }
        
        // if the object is not of the type Person they are not equal and return false 
        if (!(compared instanceof Person)){
            return false;
        }
        
        // convert the object inot Person type
        Person comparedPerson= (Person) compared;
        
        // if the variables of the object are equal they are equal
        if(this.name.equals(comparedPerson.name) &&
                this.birthday.equals(comparedPerson.birthday) &&
                this.height==comparedPerson.height &&
                this.weight==comparedPerson.weight
                ){
            return true;
        }
        // otherwise return false
        return false;
    }
}
