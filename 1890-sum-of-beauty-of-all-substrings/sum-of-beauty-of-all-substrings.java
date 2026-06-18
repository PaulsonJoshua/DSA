class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            int freq[]=new int[26];
            for(int j=i;j<s.length();j++)
            {
                int min=Integer.MAX_VALUE,max=0;
                freq[s.charAt(j)-'a']++;
                for(int k=0;k<26;k++)
                {
                    if(freq[k]>0)
                    {
                        max=Math.max(freq[k],max);
                        min=Math.min(freq[k],min);
                    }
                }
                ans+=(max-min);
            }
        }
        return ans;
    }
}