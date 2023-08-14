
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        // initialzie inter variable to store the first index of the list
        int first=0;
        // initialzie inter variable to store the last index of the list
        int last=list.size()-1;
        
        System.out.println(list.get(first));
        System.out.println(list.get(last));

    }
}
