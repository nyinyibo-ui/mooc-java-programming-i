
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics statistics = new Statistics();
        Statistics evenStatistics=new Statistics();
        Statistics oddStatistics=new Statistics();

        System.out.println("Enter numbers:");
        while (true) {

            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }else if(number%2==0){
                evenStatistics.addNumber(number);
            }else{
                oddStatistics.addNumber(number);
            }
            
            statistics.addNumber(number);

        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: "+evenStatistics.sum());
        System.out.println("Sum of odd numbers: "+oddStatistics.sum());
    }
}
