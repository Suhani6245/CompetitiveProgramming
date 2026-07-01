package Sorting_algo;
import java.util.*;

public class SelectionSort {

    //find largest number that can be formed by arranging the digits given in an array
    public static int largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        if (strNums[0].equals("0")) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (String num : strNums) {
            sb.append(num);
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args){
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min_idx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            // swap arr[i] and arr[min_idx]
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println("Largest number that can be formed: " + largestNumber(nums));

    }
}
