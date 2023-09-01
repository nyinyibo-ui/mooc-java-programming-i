/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author alexe
 */
public class UserInterface {

    private Scanner scanner;
    private Points points;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.points = new Points();

    }

    public void start() {
        readInput();
        System.out.println("");
        printAverage();
        printAveragePassing();
        printPassPct();
        printGrades();
    }

    public void readInput() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            String input = scanner.nextLine();
            Integer point = Integer.valueOf(input);

            if (input.equals("-1")) {
                break;
            }

            // Exclude points less than zero or greater than 100
            if (point < 0 || point > 100) {
                continue;
            }
            this.points.addPoints(Integer.valueOf(input));

        }
    }

    public void printAverage() {
        System.out.println("Point average (all): " + points.average());
    }

    public void printAveragePassing() {
        String nonePassing = "-";
        if (this.points.averagePassing() == 0.00) {
            System.out.println("Point average (passing): " + nonePassing);
        } else {
            System.out.println("Point average (passing): " + points.averagePassing());
        }
    }

    public void printPassPct() {
        System.out.println("Pass percentage: " + points.passPct());
    }

    public void printGrades() {
        int grade = 5;
        System.out.println("Grade distribution:");

        while (grade >= 0) {
            int total=this.points.totalGradesForPoint(grade);
            System.out.print(grade+":");
            printStars(total);
            System.out.println("");
            
            grade--;
        }
    }
    
    public void printStars(int stars){
        
        while(stars>0){
            System.out.print("*");
            stars--;
        }
    }
}
