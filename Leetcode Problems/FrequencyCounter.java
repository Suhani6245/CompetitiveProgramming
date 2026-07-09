public class FrequencyCounter {

    public static int[] countFrequency(int[] nums){
        int max = Integer.MIN_VALUE; 
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max) max = nums[i];
        }
        int[] freq = new int[max+1];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        return freq;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,1,2,3,4,5};
        int[] res = countFrequency(arr);
        for(int i=0; i<res.length; i++){
            if(res[i]>0) System.out.println(i+" : "+res[i]);
        }
    }
}
