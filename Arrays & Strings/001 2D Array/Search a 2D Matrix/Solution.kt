class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        for(i in 0..matrix.size-1) {
            var start = 0
            var end = matrix[0].size-1
            
            //Peform Binary search in each row
            while(start<=end) {
                var mid= start+ (end-start)/2
                
                when {
                    target== matrix[i][mid] -> return true
                    target< matrix[i][mid] -> end=mid-1
                    else -> start = mid+1
                }
            }
        }
        
        return false
    }
}
