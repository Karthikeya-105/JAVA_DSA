class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""
        st=strs[0]
        for i in range(len(st)):
            ch=st[i]
            for j in range(1,len(strs)):
                if i>=len(strs[j]) or strs[j][i]!=ch:
                    return st[:i]
        return st
            
        