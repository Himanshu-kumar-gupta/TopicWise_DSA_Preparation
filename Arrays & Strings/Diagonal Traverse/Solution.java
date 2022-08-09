class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length,n=mat[0].length,row=0,col=0;
        int diagonal[] = new int[m*n]; 
        
        for(int i=0;i<m*n;i++) {
            diagonal[i]=mat[row][col];
            //row + col for a diagonal remains same
            //and in diagonal starting with odd as 0,1
            //we need to move down
            //in diagonal starting with even as 2,0(0,2)
            //we need to move up
            
            // Upside
            if((row+col)%2==0) {
                //Order of conditions matter as in 0,n-1
                //we should increase row
                //if order is reversed then col will be increased to n i.e. outofbound
                if(col==n-1) {
                    row++;
                }
                else if(row==0) {
                    col++;
                }
                else {
                    row--;
                    col++;
                }
            } 
            else {    //downside
                if(row==m-1) {
                    col++;
                }
                else if(col==0) {
                    row++;
                }
                else {
                    row++;
                    col--;
                }
            }
        }
        return diagonal;
    }
}
