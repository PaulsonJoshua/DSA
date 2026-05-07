class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       ArrayList<Integer> al=new ArrayList<>();
       boolean vis[]=new boolean[nums2.length];
       for(int i=0;i<nums1.length;i++)
       {
        for(int j=0;j<nums2.length;j++)
        {
            if(nums1[i]==nums2[j] && vis[j]==false)
            {
                al.add(nums2[j]);
                vis[j]=true;
                break;
            }
        }
       }
       int temp[]=new int[al.size()];
       int index=0;
       for(int mercy:al)
       {
        temp[index++]=mercy;
       }
       return temp;
    }
}