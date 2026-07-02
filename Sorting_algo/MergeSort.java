package Sorting_algo;
import java.util.Arrays;

public class MergeSort {

     // 1. Recursive Divide Step
    public static void mergeSort(int[] array, int left, int right) {
        // Base case
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        // Sort left half 
        mergeSort(array, left, mid);

        // Sort right half
        mergeSort(array, mid + 1, right);

        // Merge two sorted halves
        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        //temp arrays
        int[] leftArray = new int[lengthLeft];
        int[] rightArray = new int[lengthRight];

        // Copy original elements into the temporary arrays
        System.arraycopy(array, left, leftArray, 0, lengthLeft);
        System.arraycopy(array, mid + 1, rightArray, 0, lengthRight);

        int i = 0; // Pointer for leftArray
        int j = 0; // Pointer for rightArray
        int k = left; // Pointer for original array

        // Compare and merge
        while (i < lengthLeft && j < lengthRight) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of leftArray
        while (i < lengthLeft) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements of rightArray
        while (j < lengthRight) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int [] array = {1,4,5,6,3,9};

        System.out.println("Original Array:");
        printArray(array);

        // Initiate merge sort on the entire array bounds
        mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted Array:");
        printArray(array);
    }
}
