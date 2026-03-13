class Solution {
    public boolean isFascinating(int n) {
        long sum=n;
        String temp="";
        for(int i=1;i<=3;i++)
        {
             sum=n*i;
             temp+=String.valueOf(sum);
        }
        boolean arr[]=new boolean[10];
        for(int i=0;i<temp.length();i++)
        {
            char ch=temp.charAt(i);
            int k=ch-'0';
            if(k==0)
            return false;
            arr[k]=true;
        }
        if(temp.length()!=9)
        return false;
        for(int i=1;i<10;i++)
        {
            if(!arr[i])
            {
                return false;
            }
        }
        return true;
    }
}