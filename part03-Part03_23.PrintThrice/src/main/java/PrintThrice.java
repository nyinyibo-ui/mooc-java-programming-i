
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word:");
        String words=scanner.nextLine();
        System.out.println(words+words+words);

    }
}
