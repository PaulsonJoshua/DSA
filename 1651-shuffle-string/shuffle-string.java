class Solution {
    public String restoreString(String s, int[] indices) {
        char arr[]=new char[s.length()];
        int ind=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[indices[ind++]]=s.charAt(i);
        }
        return new String(arr);
    }
}