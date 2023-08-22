
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(2, 10);

    }

    public static void divisibleByThreeInRange(int lower, int upper) {
        for (int i = lower; i <= upper; i++) {

            if (i % 3 == 0) {
                System.out.println(i);

            }
        }
    }

}
