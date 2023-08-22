
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> names=new ArrayList<>();

        while (true) {

            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] pieces = string.split(",");
            ages.add(Integer.valueOf(pieces[1]));
            names.add(pieces[0]);
        }
        int oldestAge= Collections.max(ages);
        System.out.println("Name of the oldest: "+names.get(ages.indexOf(oldestAge)));
        
        

    }
}
