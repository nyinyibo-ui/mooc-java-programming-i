
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Give points [0-100]:");
        int point=Integer.valueOf(scan.nextLine());
        
        if (point<0){
            String grade="impossible!";
            System.out.println("Grade:"+grade);
        }else if(point<=49){
            String grade="failed";
            System.out.println("Grade:"+grade);
        }else if(point<=59){
            String grade="1";
            System.out.println("Grade:"+grade);
        }else if(point<=69){
            String grade="2";
            System.out.println("Grade:"+grade);
        }else if(point<=79){
            String grade="3";
            System.out.println("Grade:"+grade);
        }else if(point<=89){
            String grade="4";
            System.out.println("Grade:"+grade);
        }else if(point<=100){
            String grade="5";
            System.out.println("Grade:"+grade);
        }else{
            String grade="incredible!";
            System.out.println("Grade:"+grade);
        }
    }
}
