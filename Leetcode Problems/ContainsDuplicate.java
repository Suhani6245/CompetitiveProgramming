
import java.util.*;
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        // int max = Integer.MIN_VALUE; 
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]>max) max = nums[i];
        // }
        // int[] freq = new int[max+1];
        // for(int i=0; i<nums.length; i++){
        //     freq[nums[i]]++;
        //     if(freq[nums[i]]>1) return true;
        // }
        // return false;

        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        //     if(map.get(nums[i])>1) return true;
        // }
        // return false;

        
        //hashset
        Set<Integer> seen = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(seen.contains(nums[i])) return true;
            seen.add(nums[i]);
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,1};
        boolean res = containsDuplicate(arr);
        System.out.println(res);
    }
}
