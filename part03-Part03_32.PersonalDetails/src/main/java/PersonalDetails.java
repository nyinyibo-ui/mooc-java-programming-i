
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
                while (true) {
        
                    String string = scanner.nextLine();
                    if (string.equals("")) {
                        break;
                    }
                    String[] pieces = string.split(",");
                    ages.add(Integer.valueOf(pieces[1]));
                    names.add(pieces[0]);
                }
        System.out.println("Longest Name: "+longestOfTheName(names));
        System.out.println("Average of the birth years: "+AvgOfBirthYears(ages));
    }
    public static String longestOfTheName(ArrayList<String> string) {
        int index = 0;
        String longestName = "a";
        while (index < string.size()) {
            if (longestName.length() < string.get(index).length()) {
                longestName = string.get(index);
            }
            index++;
        }
        return longestName;
    }
    public static Double AvgOfBirthYears(ArrayList<Integer> years){
        int count=0;
        int sum=0;
        for(int year:years){
            count++;
            sum+=year;
        }
        double avg=(double)sum/count;
        return avg;
    }
}
