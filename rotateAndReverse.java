public class rotateAndReverse {
    public static int[] rightRotate(int[] arr, int k){
        if(k==0) return arr;
        int[] rotateArr = new int[arr.length];
        int p = 1;
        while (p <= k) {
            int first = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                rotateArr[i] = arr[i + 1];
                //for in-place rotation, we need to update the original array as well
                //arr[i] = arr[i + 1];
            }
            rotateArr[arr.length - 1] = first;
            //for inplace rotation, we need to update the original array as well
            //arr[arr.length - 1] = first;
            p++;
        }
        return rotateArr;
        
    }

    public static int[] leftRotate(int[] arr, int k){
        if(k==0) return arr;
        int[] rotateArr = new int[arr.length];
        int p = 1;
        while (p <= k) {
            int last = arr[arr.length - 1];
            
            for (int i = arr.length - 1; i > 0; i--) {
                rotateArr[i] = arr[i - 1];
                //for in-place rotation, we need to update the original array as well
                //arr[i] = arr[i + 1];
            }
            
            rotateArr[0] = last;
            //for inplace rotation, we need to update the original array as well
            //arr[0] = last;
            p++;
        }
        return rotateArr;
        
    }

    public static int[] reverse(int[] arr){
        int[] revArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            revArr[i] = arr[arr.length-1-i];
        }
        return revArr;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        //rotate by k
        int k=3;
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("Right Rotate by "+k+":");
        printArray(rightRotate(arr, k));
        System.out.println("Left Rotate by "+k+":");
        printArray(leftRotate(arr, k));
        System.out.println("Reverse of the array:");
        printArray(reverse(arr));
    }
}
