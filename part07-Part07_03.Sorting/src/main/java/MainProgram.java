
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // indices:       0  1  2  3   4
//        int[] numbers = {-1, 6, 9, 8, 12};
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        int[] numbers = {8, 7, 6, 5, 4, 3, 2, 1, 0};

        sort(numbers);
    }

    // static function to get the smallest number
    public static int smallest(int[] array) {
        // first index as preset value
        int smallest = array[0];

        for (int i : array) {
            if (smallest > i) {
                smallest = i;
            }
        }
        return smallest;
    }

    // function to get the index of smallest number
    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest(array) == array[i]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;

    }

    // static function to get the index of smallest number from the given start index
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallest = startIndex;
        int smallestNumber = array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (smallestNumber > array[i]) {
                indexOfSmallest = i;
                smallestNumber = array[i];
            }
        }
        return indexOfSmallest;
    }

    // static function to swap place
    public static void swap(int[] array, int index1, int index2) {
        int bufferNumber = array[index2];
        array[index2] = array[index1];
        array[index1] = bufferNumber;
    }

    // static funtion to sort
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));

        // start from 0
        /*
        -Examine the array starting from index 0. Swap the following two numbers with each other: the number at index 0, and the smallest number in the array starting from index 0.
        -Examine the array starting from index 1. Swap the following two numbers with each other: the number at index 1, and the smallest number in the array starting from index 1.
        -Examine the array starting from index 2. Swap the following two numbers with each other: the number at index 2, and the smallest number in the array starting from index 2.
        -Etc.
         */
        for (int start = 0; start < array.length; start++) {
            MainProgram.swap(array, indexOfSmallestFrom(array, start), start);
            System.out.println(Arrays.toString(array));
        }
    }
}
