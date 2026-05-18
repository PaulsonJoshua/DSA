class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int max=200;
        int ind=-1;
        for(int i=0;i<capacity.length;i++)
        {
            if(capacity[i]>=itemSize && capacity[i]<max)
            {
                
                max=capacity[i];
                ind=i;
                
                
            }
        }
        return ind;
    }
}