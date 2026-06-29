package Arrays;
public class prefixSum {
    public static int[][] prefixSum2D(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] prefix = new int[rows][cols];

        int sum = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum += arr[i][j];
                prefix[i][j] = sum;
            }
        }

        return prefix;
    }

    //fix this
    public static int[][] prefixSum2DRowWise(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] prefix = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(i==0 && j==0) prefix[i][j] = arr[i][j];
                else if(i==0) prefix[i][j] = prefix[i][j-1] + arr[i][j];
                else if(j==0) prefix[i][j] = prefix[i-1][j] + arr[i][j];
                else prefix[i][j] = prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1] + arr[i][j];

            }
        }

        return prefix;
    }

    public static void print(int[][] arr){
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        int[][] prefix = prefixSum2D(arr);
        print(prefix);   //{{1,3},{6,10},{15,21}}
        print(prefixSum2DRowWise(arr));         //{{1,3},{4,6},{5,6}}

    }
}