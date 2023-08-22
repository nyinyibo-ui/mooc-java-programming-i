
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        // write some code here
        int sum=number1+number2+number3+number4;
        return sum;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        //write some code here
        int sum=sum(number1,number2,number3,number4);
        double average=(double)sum/4.0;
        return average;
    }

    public static void main(String[] args) {
        double result = average(1,2,3,4);
        System.out.println("Average: " + result);
    }
}
