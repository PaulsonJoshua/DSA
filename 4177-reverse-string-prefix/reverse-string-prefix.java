class Solution {
    public String reversePrefix(String s, int k) {
        int i=0;
        int j=k-1;
        char tmp[]=s.toCharArray();
        while(i<j)
        {
            char tmp1=tmp[i];
            tmp[i]=tmp[j];
            tmp[j]=tmp1;
            i++;
            j--;
        }
        return new String(tmp);
    }
}