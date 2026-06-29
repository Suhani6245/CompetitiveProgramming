package Searching_Algo;
import java.util.*;
public class BinarySearch {
    public static String binarySearch(int[]arr, int target){
        if(arr.length==0) return "Element not found";
        Arrays.sort(arr);
        int mid = arr.length/2;
        //found
        if(arr[mid]==target) return "Element found";
        if(arr[mid]<target) return binarySearch(Arrays.copyOfRange(arr, mid + 1, arr.length), target);
        return binarySearch(Arrays.copyOfRange(arr, 0, mid), target);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int target = 30;
        System.out.println(binarySearch(arr, target));
        System.out.println(binarySearch(arr, 100));
    }
}
