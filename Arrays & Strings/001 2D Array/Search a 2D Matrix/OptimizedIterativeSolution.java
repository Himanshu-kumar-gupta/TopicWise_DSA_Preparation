class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int start = 0;
        int end = m*n-1;
        
        //Consider the matrix like a single array and Perform Binary search 
        while(start<=end) {
            int mid= start+ (end-start)/2;
            int midEle = matrix[mid/n][mid%n];
            if(target== midEle)
                return true;
            else if (target< midEle)
                end=mid-1;
            else 
                start = mid+1;
        }
        
        return false;
    }
}
