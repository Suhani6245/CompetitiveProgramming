//import java.util.*;
package Arrays;
public class subarrays {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        // for(int i=0; i<arr.length; i++){
        //     for(int j=i; j<arr.length; j++){
        //         System.out.print("[");
        //         for (int k = i; k <= j; k++) {
        //             System.out.print(arr[k] + (k == j ? "" : ", "));
        //         }
        //         System.out.println("]");
        //     }
        // }

        //while
        int i = 0;
        while (i < arr.length) {
            int j = i;
            while (j < arr.length) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + (k == j ? "" : ", "));
                }
                System.out.println("]");
                j++;
            }
            i++;
        }
    }
}
