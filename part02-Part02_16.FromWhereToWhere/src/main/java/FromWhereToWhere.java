
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int upper=scanner.nextInt();
        
        System.out.println("Where from?");
        int lower=scanner.nextInt();
        for (int i=lower;i<=upper;i++){
            System.out.println(i);
        }
        
    }
}
