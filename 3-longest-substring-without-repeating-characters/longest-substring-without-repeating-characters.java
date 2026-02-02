class Solution {
    public int lengthOfLongestSubstring(String s) {
         int hash[]=new int[256];
        for(int i=0;i<256;i++)
        {
            hash[i]=-1;
        }
        int l=0,r=0;
        int max_len=0;
        while(r<s.length())
        {
            char c=s.charAt(r);
            if(hash[c]!=-1)
            {
                if(hash[c]>=l)
                {
                   
                    l=hash[c]+1;
                }
            }
            int len=r-l+1;
            max_len=Math.max(len,max_len);
            hash[c]=r;
            r++;
        }
        return max_len;
    }
}