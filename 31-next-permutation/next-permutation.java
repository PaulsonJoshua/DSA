class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            rev(nums,0,nums.length-1);
            return;
        }
        for(int i=n-1;i>=index;i--)
        {
            if(nums[i]>nums[index])
            {
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }
        rev(nums,index+1,nums.length-1);
    }
    public static void rev(int nums[],int start,int end)
    {
        while(start<=end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}