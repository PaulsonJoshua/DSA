class Solution {
    public int firstMatchingIndex(String s) {
        int start=0,end=s.length()-1;
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                return start;
            }
        }
        return -1;
    }
}