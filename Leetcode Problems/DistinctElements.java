
import java.util.*;
//return number of distinct elements
public class DistinctElements {
    public static int countDistinct(int[] arr){
        //brute 
        // if(arr.length<=0) return -1;
        // if(arr.length==1) return 1;
        // int count=0;
        // for(int i=0; i<arr.length; i++){
        //     boolean isDistinct = true;
        //     for(int j=0; j<i; j++){
        //         if(arr[i]==arr[j]){
        //             isDistinct = false;
        //             break;
        //         }
        //     }
        //     if(isDistinct) count++;
        // }
        // return count;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1) count++;
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,3,5};
        System.out.print("Number of distincts elements "+countDistinct(arr));
    }
}
