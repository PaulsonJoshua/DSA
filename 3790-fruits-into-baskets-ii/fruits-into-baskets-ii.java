class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        int temp[]=new int[fruits.length];
        for(int i=0;i<fruits.length;i++)
        {
            temp[i]=0;
        }
        for(int i=0;i<fruits.length;i++)
        {
            for(int j=0;j<baskets.length;j++)
            {
                if(fruits[i]<=baskets[j] && temp[j]!=1)
                {
                    temp[j]=1;
                    break;
                }
            }
        }
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]==0)
            {
                count++;
            }
        }
        return count;
    }
}