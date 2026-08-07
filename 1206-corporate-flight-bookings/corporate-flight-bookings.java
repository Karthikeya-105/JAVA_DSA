class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr=new int[n];
        for(int[] i:bookings){
            int first=i[0];
            int last=i[1];
            int val=i[2];
            arr[first-1]+=val;
            if(last<n){
                arr[last]-=val;
            }
        }
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
        
    }
}