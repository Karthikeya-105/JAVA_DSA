class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] arr=new int[n];
        Deque<Integer> stack =new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int prev=stack.pop();
                arr[prev]=i-prev;

            }
            stack.push(i);
        }
        return arr;
        
    }
}