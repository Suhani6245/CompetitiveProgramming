public class setZeros {
    // public static void setZeroes(int[][] matrix, int row, int col){
        
    //     for(int j=0; j<matrix[0].length; j++){
    //         matrix[row][j] = 0;
    //     }
    //     for(int i=0; i<matrix.length; i++){
    //         matrix[i][col] = 0;
    //     }
        
    // }
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3},
            {4,0,6},
            {7,8,9}
        };


        //working only for one zero in the matrix
        int row=0; int col=0 ;
        while(row<arr.length && col<arr[0].length){
            if(arr[row][col]==0){
                break;
            }
            else{
                row++;
                col++;
            }
        }

        for(int j=0; j<arr[0].length; j++){
            arr[row][j] = 0;
        }

        for(int i=0; i<arr.length; i++){
            arr[i][col] =0;
        }
        // int row = 0; int col = 0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if(arr[i][j]==0){
        //             row = i;
        //             col = j;
        //             //setZeroes(arr, row, col);
        //         }
        //         continue;
        //     }
        // }

        
        // int row=0; int col=0 ;
        // while(row<arr.length && col<arr[0].length){
        //     if(arr[row][col]==0){
        //         break;
        //     }
        //     else{
        //         row++;
        //         col++;
        //     }
        // }

        // for(int j=0; j<arr[0].length; j++){
        //     arr[row][j] = 0;
        // }

        // for(int i=0; i<arr.length; i++){
        //     arr[i][col] =0;
        // }

        
        // for(int i=0; i<arr.length; i++){
        //     boolean count = false;
        //     for(int j=0; j<arr.length; j++){
        //         if(arr[i][j] == 0){
        //             count= true;
        //             break;
        //         }
        //     }
        //     if(count){
        //         for(int j=0; j<arr.length; j++){
        //             arr[i][j] = 0;
        //         }

        //     }
        // }


        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
