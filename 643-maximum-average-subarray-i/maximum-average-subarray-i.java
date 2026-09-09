class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum+=nums[i];
        }
        int ans=windowsum;
        for(int i=k;i<nums.length;i++){
            windowsum+=nums[i];
            windowsum-=nums[i-k];
            ans=Math.max(ans,windowsum);
        }
        return (double)ans/k;
        
    }
}