class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rOrign= mat.length;
        int cOrign=mat[0].length;
        int matEle = rOrign * cOrign;
        if(matEle!=r*c)
            return mat;
            
        int res[][] = new int[r][c];
        
        //Looping like 1D array and filling position at 2D
        //Watch the i/c & i%c
        for(int i=0;i<matEle;i++)
            res[i/c][i%c] = mat[i/cOrign][i%cOrign];
        
        return res;
    }
}
