class Solution {
    public int maxDepth(String s) {
        int max_count=0;
        int count=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                count++;
            }
            else if(ch==')')
            {
                count--;
            }
            max_count=Math.max(max_count,count);
        }
        return max_count;
    }
}