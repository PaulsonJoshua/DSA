class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length <=1)
        return true;
        int j=0;
        while(j<nums.length-1 && nums[j]==nums[j+1])
        {
            j++;
        }
        if(j==nums.length-1)
        return true;
        if(nums[j]>nums[j+1])
        {
            for(int i=j;i<nums.length-1;i++)
            {
                if(nums[i]>=nums[i+1])
                continue;
                else
                {
                    return false;
                }
            }
        }
        else 
        {
            for(int i=1;i<nums.length-1;i++)
            {
                if(nums[i]<=nums[i+1])
                continue;
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}