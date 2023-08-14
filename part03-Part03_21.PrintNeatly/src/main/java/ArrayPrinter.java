
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        for (int index=0; index<array.length-1;index++){
            System.out.print(array[index]+","+" ");
        }
        System.out.print(array[array.length-1]);
    }
}
