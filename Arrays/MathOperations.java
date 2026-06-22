package Arrays;
import java.util.*;

public class MathOperations {

    //sum function
    public static int sum(int[] numArr){
        int sum=0;
        for(int i=0; i<numArr.length; i++){
            sum+=numArr[i];
        }
        return sum;
    } 

    //average function
    public static int average(int[] numArr){
        return sum(numArr)/numArr.length;
    }

    //max function
    public static int max(int[] numArr){
        int max = numArr[0];        
        for(int i=0; i<numArr.length; i++){
            if(numArr[i] > max){
                max = numArr[i];
            }
        }
        return max;
    }

    public static int secondMax(int[] numArr){
        Arrays.sort(numArr);
        return numArr[numArr.length-2];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Sum: " + sum(arr));
        System.out.println("Average: " + average(arr));
        System.out.println("Max: " + max(arr));
        System.out.println("Second Max: "+ secondMax(arr));
    }
}
