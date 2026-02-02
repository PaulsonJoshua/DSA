class Solution {
    public int firstMissingPositive(int[] nums) {
         int n=nums.length;
        int i=0;
        while(i<n)
        {
            int corind=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[corind])
            {
                swap(nums,i,corind);
            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                return j+1;
            }
        }
        return nums.length+1;
    }
    public static void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    
}