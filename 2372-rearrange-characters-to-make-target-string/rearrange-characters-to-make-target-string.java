class Solution {
    public int rearrangeCharacters(String s, String target) {
        int count=0;
        int temp[]=new int[26];
        int temp1[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            temp[s.charAt(i)-'a']++;
        }
        for(int i=0;i<target.length();i++)
        {
            temp1[target.charAt(i)-'a']++;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<26;i++)
        {
            if(temp1[i]>0)
            min=Math.min(min,temp[i]/temp1[i]);
        }
        return min;
    }
}