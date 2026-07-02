package Sorting_algo;
public class Leetcode451 {

    public static String countSortString(String str){
        char[] arr = str.toCharArray();
        //step 1 find max
        char max = arr[0];
        for(char ch: arr){
            if(ch>max){
                max = ch;
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

        //step 4: prefix sum of count array
        for(int i=1; i<count.length;i++){
            count[i] += count[i-1];
        }

        //step 5: create output string
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]);
            count[arr[i]]--;
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        String s = "cccaaa";
        System.out.printf("Input String: %s\n", s);
        System.out.printf("Output String: %s\n", countSortString(s));

    }
}
