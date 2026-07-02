package Sorting_algo;


public class QuickSort {

    public static void sortArray(int[] nums) {
        int pivot = nums[nums.length-1];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
            }
        }

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
        //return nums;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        sortArray(arr);
    }
}
