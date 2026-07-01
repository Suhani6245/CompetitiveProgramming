package Bit_Manipulation;

public class GreyCode {
    public static void main(String[] args){
        int n = 2;
        //Gray code for n bits is a sequence of 2^n integers where two successive integers differ in only one bit.
        //The Gray code sequence must begin with 0.
        int[] result = new int[(int)Math.pow(2, n)];
        int[] grayCode = new int[result.length];

        //decimal to gray code conversion formula: gray = binary ^ (binary >> 1)
        for(int i = 0; i < result.length; i++){
            result[i] = i ^ (i >> 1);
        }

        //gray to binary conversion formula: binary = gray ^ (gray >> 1)
        for(int i = 0; i < result.length; i++){
            int gray = result[i];
            int binary = 0;
            while(gray > 0){
                binary ^= gray;
                gray >>= 1;
            }
            grayCode[i] = binary;
        }

        System.out.println("Gray code for " + n + " bits:");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
        System.out.println("Binary code for " + n + " bits:");
        for(int i = 0; i < grayCode.length; i++){
            System.out.print(grayCode[i] + " ");
        }
    }
}
