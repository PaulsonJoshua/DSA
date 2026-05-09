class Solution {
    public int rob(int[] nums) {
        int n1=0;
        int n2=0;
        for(int num:nums)
        {
            int max=Math.max(n1+num,n2);
            n1=n2;
            n2=max;
        }
        return n2;
}}