class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i]; 
        }
        int ans=windowSum;
        for(int right=k;right<nums.length;right++){
            windowSum+=nums[right];
            windowSum-=nums[right-k];
            ans=Math.max(ans,windowSum);
        }
        return (double)ans/k;
    }
}