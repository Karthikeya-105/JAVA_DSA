class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> current=new HashMap<>();
        int left=0;
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        int k=s1.length();
        for(int right=0;right<s2.length();right++){
            current.put(s2.charAt(right),current.getOrDefault(s2.charAt(right),0)+1);
            if(right-left+1>k){
                current.put(s2.charAt(left),current.getOrDefault(s2.charAt(left),0)-1);
            
            if (current.get(s2.charAt(left)) == 0) {
                    current.remove(s2.charAt(left));
             }
                left++;
            }
            if(map.equals(current)){
                return true;
            }

        }

        return false;
    }
}