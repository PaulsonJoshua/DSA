class Solution {
    public boolean check(int[] nums) { 
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            boolean isSorted=true;
            for(int j=0;j<nums.length-1;j++)
            {
                int cur=nums[(i+j)%n];
                int nxt=nums[(i+j+1)%n];
                if(cur>nxt)
                {
                    isSorted=false;
                }
            }
            if(isSorted)
            {
                return true;
            }
        }
        return false;
    }
}