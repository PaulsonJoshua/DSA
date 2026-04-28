class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int temp[]=new int[101];
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        List<Integer> MissingNumbers=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            smallest=Math.min(nums[i],smallest);
            largest=Math.max(nums[i],largest);
            temp[nums[i]]++;
        }
        for(int i=smallest;i<=largest;i++)
        {
            if(temp[i]==0)
            {
                MissingNumbers.add(i);
            }
        }
        return MissingNumbers;
    }
}