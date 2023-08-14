
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Frist name:");
            String firstName=scanner.nextLine();
            if (firstName.equals("")){
                break;
            }
            
            System.out.println("Last name:");
            String lastName=scanner.nextLine();
            
            System.out.println("Identification nubmer:");
            String id=scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName,lastName,id));
                   
        }
        
        for (PersonalInformation info: infoCollection){
            System.out.println(info.getFirstName()+" "+info.getLastName());
        }
    }
}
