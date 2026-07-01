package Sorting_algo;
import java.util.*;

public class Kth_largestElement {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,5,6,7,9,7,8};
        int k = 5;
        //method 1 : using built in sort
        Arrays.sort(arr);
        System.out.println(k+"th largest element: "+arr[arr.length-k]);

        //method 2: selection sort
        for(int i=0; i<k; i++){
            int max_idx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[max_idx]){
                    max_idx = j;
                }
            }
            // swap arr[i] and arr[max_idx]
            int temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }

        System.out.println(k+"th largest element: "+arr[k-1]);

    }
}
