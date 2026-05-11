class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int  reshape[][]=new int[r][c];
        int k=0,l=0;
        if(r*c != mat.length*mat[0].length)
        return mat;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                int el=mat[i][j];
                    reshape[k][l]=el;
                    l++;
                    if(l==c)
                    {
                        l=0;
                        k++;
                    }
            }
        }
        return reshape;
    }
}