class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length/2;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<candyType.length;i++)
        {
            hs.add(candyType[i]);
        }
        int len=0;
        for(int i:hs)
        {
            len++;
            n--;
            if(n==0)
            {
                break;
            }
        }
        return len;
    }
}