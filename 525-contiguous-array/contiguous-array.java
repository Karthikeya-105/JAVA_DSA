class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int[] arr=new int[n];
        int sum=0;
        int maxLen=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                arr[i]=-1;
            }
            if(nums[i]==1){
                arr[i]=1;
            }
        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                int len=i-map.get(sum);
                maxLen=Math.max(maxLen,len);
            }
            else{
            map.put(sum,i);
            }
        }


        return maxLen;
    }
}