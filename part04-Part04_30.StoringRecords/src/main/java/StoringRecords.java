
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        try(Scanner fileScan=new Scanner(Paths.get(file))){
            while(fileScan.hasNextLine()){
                String line=fileScan.nextLine();
                // creating array to store the name and age split by comma
                String [] parts=line.split(",");
                
                //add the Person object into person arraylist
                persons.add(new Person(parts[0],Integer.valueOf(parts[1])));
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        // and printing the read records
        return persons;

    }
}
