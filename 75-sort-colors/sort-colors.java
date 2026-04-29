class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int mid=0;
        int right=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[mid]==0)
            {
                swap(nums,left,mid);
                mid++;
                left++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(nums,mid,right);
                right--;
            }
        }
    }
    public static void swap(int nums[],int left,int right)
    {
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}