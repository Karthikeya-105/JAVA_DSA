class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int pile:piles){
            right=Math.max(right,pile);
        }
        while(left<right){
            int speed=left+(right-left)/2;
            if(canFinish(piles,h,speed)){
                right=speed;
            }
            else{
                left=speed+1;
            }
        }
        return left;
    }
    public boolean canFinish(int[] piles,int h,int speed){
        long hours=0;
        for(int pile:piles){
            hours+= (pile+(long)speed-1)/speed;
        if(hours>h) 
        {
            return false;
        }
      

    }
          return true;
    }
}

