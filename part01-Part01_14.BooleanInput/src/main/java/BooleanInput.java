
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a string:");
            String text=scanner.nextLine();
        System.out.println("Give an integer:");
            int integer=Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
            double decimal=Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
            boolean bool=Boolean.valueOf(scanner.nextLine());
        
            
        System.out.println("You gave the string "+text);
        System.out.println("You gave the integer "+integer);
        System.out.println("You gave the double "+decimal);
        System.out.println("You gave the boolean "+bool);



        

    }
}
