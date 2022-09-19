class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val m= matrix.size
        val n= matrix[0].size
        var start = 0
        var end = m*n-1
            
        //Consider the matrix like a single array and Peform Binary search
        while(start<=end) {
            var mid= start+ (end-start)/2
            var midEle = matrix[mid/n][mid%n]
            when {
                target== midEle -> return true
                target< midEle -> end=mid-1
                else -> start = mid+1
            }
        }
        
        return false
    }
}
