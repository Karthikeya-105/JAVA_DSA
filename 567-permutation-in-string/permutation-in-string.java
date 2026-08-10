class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> current=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int right=0;right<s2.length();right++){
            char ch=s2.charAt(right);
            current.put(ch,current.getOrDefault(ch,0)+1);
            if((right-left+1)>s1.length()){
            char leftchar=s2.charAt(left);
            current.put(leftchar,current.get(leftchar)-1);
             if (current.get(leftchar) == 0) {
                    current.remove(leftchar);
                }

            left++;
            }
            if(map.equals(current)) {
                return true;
            }
        }

        return false;
        
    }
}