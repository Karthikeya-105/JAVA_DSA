class Solution(object):
    def maxProfit(self, prices):
        n=len(prices)
        min_val=prices[0]
        ans=0
        for i in range(1,n):
            ans=max(ans,prices[i]-min_val)
            min_val=min(min_val,prices[i])
        return ans
           
       


        