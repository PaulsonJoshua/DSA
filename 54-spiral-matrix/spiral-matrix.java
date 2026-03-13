class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        List<Integer> fin=new ArrayList<>();
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                fin.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                fin.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    fin.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    fin.add(matrix[i][left]);
                    
                }
                left++;
            }
        }
        return fin;
    }
}