package Sorting_algo;
import java.util.Arrays;

public class Leetcode75 {
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};
        //dutch national flag problem 
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high){
            switch(arr[mid]){
                case 0:
                    // swap arr[low] and arr[mid]
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // swap arr[mid] and arr[high]
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }

        //sorting
        Arrays.sort(arr);

        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
