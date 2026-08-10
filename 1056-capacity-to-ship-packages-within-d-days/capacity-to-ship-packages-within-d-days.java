class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int weight:weights){
            left=Math.max(left,weight);
            right+=weight;
        }
        while(left<right){
            int capacity=left+(right-left)/2;
            if(canShip(weights,days,capacity)){
                right=capacity;
            }
            else{
            left=capacity+1;
            }
        }
        return left;

    }
    public boolean canShip(int[] weights,int days,int capacity){
        int daysUsed=1;
        int currentLoad=0;
        for(int weight:weights){
             if (currentLoad + weight > capacity) {

                daysUsed++;
                currentLoad = 0;
            }

            currentLoad += weight;

            if (daysUsed > days) {
                return false;
            }
        }

        return true;
        }
    }