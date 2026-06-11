class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int []arr=new int[num_people];
        int count=1;
        int ind=0;
        while(candies>0)
        {
            if(candies>=count)
            {
                arr[ind]+=count;
                candies-=count;
            }
            else
            {
                arr[ind]+=candies;
                candies=0;
            }
            count++;
            ind=(ind+1)%num_people;
        }
        return arr;
    }
}