
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // initialize variable
        int firstVolume = 0;
        int secondVolume = 0;
        int maxVolume = 100;

        while (true) {
            System.out.println("First: " + firstVolume + "/" + maxVolume);
            System.out.println("Second: " + secondVolume + "/" + maxVolume);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            // split the input into command variable and amount variable;
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            // if the command is add and the added amount is non negative
            if (command.equals("add") && amount >= 0) {
                //  add the amount if only the first conatianer volumen does not exceed max volume
                if (firstVolume <= maxVolume) {
                    firstVolume += amount;
                    // if the volume exceed the max volume set the volume into max volume
                    if (firstVolume > maxVolume) {
                        firstVolume = maxVolume;
                    }

                }
            } // if the command is move and the added amount is non negative
            else if (command.equals("move") && amount >= 0) {
                // if the removed amount is less the volume in first container
                if ((firstVolume - amount) >= 0) {
                    secondVolume += amount;
                    firstVolume -= amount;
                    // if the second volume has reached its max volume set the second volume into max volume and the first volume is not reduced
                    if (secondVolume >= maxVolume) {
                        secondVolume = maxVolume;
                        firstVolume -= 0;
                    }
                } // if the removed amount is more the volume in first container, the whole first volume is moved
                else if ((firstVolume - amount) < 0) {
                    secondVolume += firstVolume;
                    firstVolume = 0;
                    if (secondVolume >= maxVolume) {
                        secondVolume = maxVolume;
                        firstVolume-=0;
                    }
                }
            }// if the command is removed and the amount is non negative  
            else if (command.equals("remove") && amount >= 0) {
                if ((secondVolume - amount) >= 0) {
                    secondVolume -= amount;
                } else if ((secondVolume - amount) < 0) {
                    secondVolume = 0;
                }
            }

        }

    }

}
