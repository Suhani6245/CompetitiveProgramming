//import java.util.*;
package Arrays;
public class prob523 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int k = 5;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum % k == 0) {
                    System.out.print("Subarray [" + i + "," + j + "]: ");
                    for (int t = i; t <= j; t++) {
                        System.out.print(arr[t] + (t == j ? "" : " "));
                    }
                    System.out.println();
                }
            }
        }
    }
}
