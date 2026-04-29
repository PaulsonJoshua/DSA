class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        HashMap<Integer,Integer> TwoSum=new HashMap<>();
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(TwoSum.containsKey(target-nums[i]))
            {
                arr[index++]=TwoSum.get(target-nums[i]);
                arr[index++]=i;
            }
            TwoSum.put(nums[i],i);
        }
        return arr;
    }
}