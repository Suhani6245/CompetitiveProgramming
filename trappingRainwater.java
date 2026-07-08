public class trappingRainwater {

    public static int max_rainwater(int[] height){
        if(height.length<3) return 0;
        int left = 0; int right = height.length-1;
        int leftMax = height[left]; int rightMax = height[right];
        int total=0;
        int waterAdded = 0;
        while(left<=right){
            if(height[left]<height[right]){
                if(height[left]>=leftMax){
                    leftMax = height[left];
                }else{
                    waterAdded = leftMax-height[left];
                    total+=waterAdded;
                }
                left++;
            } else {
                if(height[right]>=rightMax){
                    rightMax = height[right];
                } else {
                    waterAdded = rightMax-height[right];
                    total+=waterAdded;
                }
                right--;
            }
        }

        return total;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int res = max_rainwater(arr);
        System.out.println(res);
    }
}
