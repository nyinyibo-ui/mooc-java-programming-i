
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();

        while (true) {

            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] pieces = string.split(",");
            ages.add(Integer.valueOf(pieces[1]));
        }
        System.out.println("Age of the oldest: "+Collections.max(ages));
    }
}
