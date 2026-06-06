class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum[]=new int[nums.length];
        int rightSum[]=new int[nums.length];
        leftSum[0]=0;
        rightSum[nums.length-1]=0;
        int left=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            leftSum[i]=left;
            left+=nums[i];
        }
        int right=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            rightSum[i]=right;
            right+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return nums;
    }
}