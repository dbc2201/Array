/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 13/01/20
 *   Time: 3:02 PM
 */

package array;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        printArray(numbers);
        initializeArray(numbers);
        printArray(numbers);
        bubbleSort(numbers);
        printArray(numbers);
    }

    public static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < (array.length - 1) - j; i++) {
                if (array[i] > array[i + 1]) {
                    swapArrayValues(i, i + 1, array);
                }
            }
        }
    }

    private static void swapArrayValues(int i, int i1, int[] array) {
        int temp = array[i];
        array[i] = array[i1];
        array[i1] = temp;
    }


    public static void initializeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 - i;
        }
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
