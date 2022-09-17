class Solution {
    fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {
        if(original.size!=m*n)
            return emptyArray()
        
        val res = Array(m) {IntArray(n)}
        for(i in original.indices)
            res[i/n][i%n] = original[i]
        
        return res
    }
}
