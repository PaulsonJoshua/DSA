class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> temp=new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            temp.add(genrow(i));
        }
        return temp;
    }
    public List<Integer> genrow(int k)
    {
        int ans=1;
        List<Integer> al=new ArrayList<>();
        al.add(1);
        for(int col=1;col<k;col++)
        {
            ans=ans*(k-col);
            ans=ans/col;
            al.add(ans);
        }
        return al;
    }
}