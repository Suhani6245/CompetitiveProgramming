public class MamSumPair {
    public static int maxSum(int[] nums, int k){
        int sum=0;
        for(int i=0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){
        if(j-i>=k){
        if(nums[i]+nums[j]>sum) sum= nums[i]+nums[j];
        }}}
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int res = maxSum(arr, 3);
        System.out.println(res);
    }
}
