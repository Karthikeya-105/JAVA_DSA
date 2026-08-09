class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLength=0;
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int right=0;right<s.length();right++){

            char ch=s.charAt(right);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            while(freq.get(ch)>1){
                char leftChar=s.charAt(left);
                freq.put(leftChar,freq.get(leftChar)-1);
                left++;
            }
    
        maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
        
    }
}