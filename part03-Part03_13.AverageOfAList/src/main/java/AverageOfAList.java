
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program, that first reads user input
        while (true) {
            int number = scanner.nextInt();
            // adding them on a list until user gives -1.

            if (number == -1) {
                break;
            }
            list.add(number);
        }

        // Then it computes the average of the numbers on the list
        int sum=0;
        int count=0;
        for (Integer number:list){
            sum+=number;
            count++;
        }
        // and prints it.
        System.out.println("Average: "+(double)sum/count);
    }
}
