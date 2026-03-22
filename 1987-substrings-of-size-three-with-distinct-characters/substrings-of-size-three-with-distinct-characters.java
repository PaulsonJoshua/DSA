class Solution {
    public int countGoodSubstrings(String s) {
        HashSet<Character> hs=new HashSet<>();  
        int count=0;
        for(int i=0;i<s.length()-2;i++)
        {
            hs=new HashSet();
            for(int j=i;j<i+3;j++)
            {
        
            hs.add(s.charAt(j));
            if(hs.size()==3)
            {
                count++;
                hs=new HashSet();
            }
            }
        }
        return count;
    }
}