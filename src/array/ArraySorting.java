/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 13/01/20
 *   Time: 3:02 PM
 */

package array;

import java.util.Arrays; //Package

public class ArraySorting //Class
{
    public static void main(String[] args) 
    {
        int[] numbers = new int[10];
        printArray(numbers);
        initializeArray(numbers);
        printArray(numbers);
        bubbleSort(numbers);
        printArray(numbers);
    }

    public static void bubbleSort(int[] arr) //Declaring function bubbleSort
    {
        int len = arr.length;
        for (int row = 0; row < len; row++)  //Outer loop
        {
            for (int col = 1; col < len - row; col++) //Inner loop
            {
                if (arr[col - 1] > arr[col])
                {
                    int tmp = arr[col - 1];
                    arr[col - 1] = arr[col];
                    arr[col] = tmp;
                }
            }
        }
    }

    private static void swapArrayValues(int row, int newrow, int[] array) //Swaping values to newrow
    {
        int temp = array[row];
        array[row] = array[newrow];
        array[newrow] = temp;
    }


    public static void initializeArray(int[] array)
    {
        for (int row = 0; row < array.length; row++) 
        {
            array[row] = 10 - row;
        }
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
