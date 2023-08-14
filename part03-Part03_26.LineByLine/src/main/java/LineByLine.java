
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] pieces = string.split(" ");

            int index = 0;
            while (index < pieces.length) {
                System.out.println(pieces[index]);
                index++;
            }

        }

    }
}
