class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> al=new ArrayList<>();
        int count=(n/3)+1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        System.out.println(hm);
        for(Map.Entry<Integer,Integer> tmp:hm.entrySet())
        {
            int c=tmp.getValue();
            if(c>=count)
            {
                al.add(tmp.getKey());
            }
        }
        return al;
    }
}