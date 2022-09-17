class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        val rOrign= mat.size
        val cOrign=mat[0].size
        val matEle = rOrign * cOrign
        if(matEle!=r*c)
            return mat
            
        val res = Array(r) {IntArray(c)}
        
        //Looping like 1D array and filling position at 2D
        //Watch the i/c & i%c
        for(i in 0..matEle-1)
            res[i/c][i%c] = mat[i/cOrign][i%cOrign]
        
        return res
    }
}
