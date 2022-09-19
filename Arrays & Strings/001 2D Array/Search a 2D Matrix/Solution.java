class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i= 0;i<matrix.length;i++) {
            int start = 0;
            int end = matrix[0].length-1;
            
            //Peform Binary search in each row
            while(start<=end) {
                int mid= start+ (end-start)/2;
                
                if(target== matrix[i][mid])
                    return true;
                else if (target< matrix[i][mid])
                    end=mid-1;
                else 
                    start = mid+1;
            }
        }
        
        return false;
    }
}
