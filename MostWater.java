//container with most water
//area = min(height[left],height[left]*height[right])
public class MostWater {

    public static int max(int[] height){
        int left=0, right = height.length-1, max_area =0 ;
        while(left<right){
            int width = right-left;
            int area = Math.min(height[left],height[right])*width;
            max_area = Math.max(max_area,area);
            if(height[left]<height[right]) left++;
            else right--;
        }

        return max_area;
    }
    public static void main(String[] args){
        int [] height = {1,2,3,4,5,6,7,4,2,1};
        int res = max(height);
        System.out.println(res);
    }
}
