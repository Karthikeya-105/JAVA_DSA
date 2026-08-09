class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int sol=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum>=target){
                int ans=right-left+1; 
                sol=Math.min(ans,sol);  
                sum-=nums[left];
                left++;
           
            } 
           
        }
        return sol==Integer.MAX_VALUE?0:sol;  
    }
}