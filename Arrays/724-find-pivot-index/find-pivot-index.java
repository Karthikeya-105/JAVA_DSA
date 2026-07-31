class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length==0) return 0;
        int rs=0;
        int ls=0;
        for(int num:nums){
            rs+=num;
        }
        for(int i=0;i<nums.length;i++){
            rs-=nums[i];
            if(ls==rs)return i;
            ls+=nums[i];


        }
        return -1;  
    }
}