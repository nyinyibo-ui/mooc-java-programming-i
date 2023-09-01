/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.*;

public class Points {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    private ArrayList<Integer> grades;

    // constructor
    public Points() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }



    // add the points into the lists
    public void addPoints(int addedPoint) {

        // Numbers between [0-100] are acceptable in the points list
        if (addedPoint >= 50) {
            this.passingPoints.add(addedPoint);
        }
        this.points.add(addedPoint);

        int convertedGrade = this.GradeConverter(addedPoint);
        this.grades.add(convertedGrade);
    }

    // get the average of all avaiable points
    public float average() {
        int sum = 0;

        for (Integer point : this.points) {
            sum += point;
        }
        return ((float) sum / this.points.size());
    }

    //  average method to get the average of passing points
    public float averagePassing() {

        int sum = 0;
        for (Integer point : this.passingPoints) {
            sum += point;
        }
        return (float) sum / this.passingPoints.size();
    }

    // pct of passing 
    public float passPct() {
        if (this.passingPoints.isEmpty()) {
            return 0;
        }

        return (this.passingPoints.size() / (float) this.points.size()) * 100;
    }

    public int GradeConverter(int point) {
        int grade = -1;
        if (point < 50) {
            grade = 0;
        } else if (point < 60) {
            grade = 1;
        } else if (point < 70) {
            grade = 2;
        } else if (point < 80) {
            grade = 3;
        } else if (point < 90) {
            grade = 4;
        } else if (point >= 90) {
            grade = 5;
        }
        return grade;

    }

    public int totalGradesForPoint(int grade) {
        int total = 0;
        for (int received : this.grades) {
            if (received == grade) {
                total++;
            }
        }
        return total;
   }

}
