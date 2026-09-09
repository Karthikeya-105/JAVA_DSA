class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=Integer.MIN_VALUE;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int w=right-left;
            area=Math.max(area,(h*w));
            if(height[left]<height[right]) left++;
            else if(height[left]>height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return area;
    }
}