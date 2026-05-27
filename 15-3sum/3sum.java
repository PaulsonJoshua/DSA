class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> li=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            continue;
            else
            {
                int j=i+1,k=n-1;
                while(j<k)
                {
                    int n1=nums[i]+nums[j]+nums[k];
                    if(n1<0)
                    {
                        j++;
                    }
                    else if(n1>0)
                    {
                        k--;
                    }
                    else
                    {
                        li.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        j++;
                        k--;
                        while(j<k &&(nums[j]==nums[j-1]))
                        {
                            j++;
                        }
                        while(j<k && (nums[k]==nums[k+1]))
                        {
                            k--;
                        }
                    }
                }
            }
        }
          return li;   
    }
}