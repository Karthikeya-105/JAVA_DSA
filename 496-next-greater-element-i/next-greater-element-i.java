class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack=new ArrayDeque<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums2){
        while(!stack.isEmpty() && num>stack.peek() ){
            int x=stack.pop();
            map.put(x,num);
        }
        stack.push(num);
        }
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                nums1[i]=map.get(nums1[i]);
            }
            else{
                nums1[i]=-1;
            }
   }
        
    return nums1;
    }
}