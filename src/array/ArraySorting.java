/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 13/01/20
 *   Time: 3:02 PM
 */

package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        
        //Taking input from user for making an array
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Enter the value for the "+i+" position in array");
            numbers[i] = sc.nextInt();
        }
       
        printArray(numbers);
        initializeArray(numbers);
        printArray(numbers);
        bubbleSort(numbers);
        printArray(numbers);
    }

    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
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
