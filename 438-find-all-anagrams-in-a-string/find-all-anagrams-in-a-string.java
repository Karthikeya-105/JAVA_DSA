class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int left=0;
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> current=new HashMap<>();
        //storing p
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            current.put(ch,current.getOrDefault(ch,0)+1);
           
            if(right-left+1>p.length()){
            char leftChar=s.charAt(left);
            current.put(leftChar,current.get(leftChar)-1);
            if (current.get(leftChar) == 0) {
                    current.remove(leftChar);
                }
            left++;
            }
             if(map.equals(current)){
                ans.add(left);
            }
        }
        return ans;
    }
}