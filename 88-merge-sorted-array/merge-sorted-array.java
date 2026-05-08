class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[]=new int[m+n];
        int i=0;
        int index=0;
        for(i=0;i<m;i++)
        {
            temp[index++]=nums1[i];
        }
        for(int j=0;j<n;j++)
        {
            temp[index++]=nums2[j];
        }
        for(int j=0;j<temp.length;j++)
        {
            nums1[j]=temp[j];
        }
        Arrays.sort(nums1);
    }
}