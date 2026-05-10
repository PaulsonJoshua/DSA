class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int ans[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]!=-1)
                {
                    ans[i][j]=matrix[i][j];
                }
                else
                {
                    int max=Integer.MIN_VALUE;
                    for(int k=0;k<matrix.length;k++)
                    {
                        if(matrix[k][j]>max)
                        {
                            max=matrix[k][j];
                        }
                    }

                    ans[i][j]=max;
                }
            }
        }
        return ans;
    }
}