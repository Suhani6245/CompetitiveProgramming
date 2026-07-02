package Sorting_algo;

public class CountSort {

    public static int[] countSort(int[] arr){
        //step 1 find max
        int max = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        //step 2: initialise count array with zeroes
        int [] count = new int[max+1];
        for(int i=0; i<count.length;i++){
            count[i] = 0;
        }

        //step3 : count occurances of each element
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }

        //step 4: prefix sum of count array: to get the position of each element in the output array
        for(int i=1; i<count.length;i++){
            count[i] += count[i-1];
        }

        //step 5: create output array
        int [] output = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        return output;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,2,3,4,};
        printArray(arr);
        printArray(countSort(arr));

    }
}
