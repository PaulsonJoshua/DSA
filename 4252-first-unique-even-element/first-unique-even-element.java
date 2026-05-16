class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> pairs=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            pairs.put(nums[i],pairs.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                if(pairs.get(nums[i])==1)
                {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}