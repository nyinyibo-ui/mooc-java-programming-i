
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int values = 0;
        int sum = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                values = values + 1;
                sum = sum + number;
            }
        }

        double average = (sum * 1.0) / values;
        if (average == 0 || values == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);

        }

    }
}
