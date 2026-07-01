package Bit_Manipulation;

public class MaxXORValue {
    public static void main(String[] args) {
        int[] arr = { 4, 8, 12, 16, 20 };

        int maxXOR = 0;
        int a = 0, b = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int xorValue = arr[i] ^ arr[j];

                if (xorValue > maxXOR) {
                    maxXOR = xorValue;
                    a = arr[i];
                    b = arr[j];
                }
            }
        }

        System.out.println("Maximum XOR value = " + maxXOR);
        System.out.println("Pair = " + a + " and " + b);
    }
}