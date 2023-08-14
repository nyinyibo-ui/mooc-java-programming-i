
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<String> list = new ArrayList<>();
        // initiaize variabe to count the number of numbers
        int count = 0;

        // reading the file from the path given by the user
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            // Scan row by row and cnvert string to integer for operation
            while (fileScan.hasNextLine()) {
                list.add(fileScan.nextLine());
            }

        } catch (Exception e) {
            // leaving exception if file not found;
            System.out.println("Error: " + e);
        }
        // if the number is between the lower and upper limit count it
        for (String item : list) {
            int number = Integer.valueOf(item);
            if (number >= lowerBound && number <= upperBound) {
                count += 1;
            } else {
                continue;
            }
        }

        System.out.println("Numbers: " + count);
    }
}
