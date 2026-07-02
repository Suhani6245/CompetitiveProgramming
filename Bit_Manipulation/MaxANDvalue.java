package Bit_Manipulation;
public class MaxANDvalue {
    public static void main(String[] args) {
        // max AND value of two numbers in an array
        int[] arr = { 4, 8, 12, 16, 20 };
        int maxAND = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int andValue = arr[i] & arr[j];
                if (andValue > maxAND) {
                    maxAND = andValue;
                }
            }
        }
        System.out.println("Maximum AND value: " + maxAND);
        //we get maxAND value of 16 which is 16 & 20 = 16 (bitwise AND operation)
    }
}
