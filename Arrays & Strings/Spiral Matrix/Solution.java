class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> traverseElements = new ArrayList<Integer>();
        
        //defining boundaries 
        //upbound=1 as on start upBound will increase/change
        int m=matrix.length, n= matrix[0].length, row=0, col=0,upBound=1,downBound=m-1,rBound=n-1,leftBound=0;
        String direc="right";
        for(int i=0;i<m*n;i++) {
            traverseElements.add(matrix[row][col]);
            
            switch(direc) {
                case "right" :
                    //If boundary hit in a direction
                    if(col==rBound) {
                        //Change to next appropriate direction
                        direc="down";
                        //get to next element during this step in other direc. as row++ here
                        row++;
                        //update to boundary
                        rBound--;
                    }
                    else {
                        //Traverse element if boundary not hit
                        col++;
                    }
                    
                    break;
                    
                case "down" :
                    if(row==downBound) {
                        direc="left";
                        col--;
                        downBound--;
                    }
                    else {
                        row++;
                    }
                    break;
                    
                case "left" :
                    if(col==leftBound) {
                        direc="up";
                        row--;
                        leftBound++;
                    }
                    else {
                        col--;
                    }
                    
                    break;
                    
                case "up" :
                    if(row==upBound) {
                        direc="right";
                        col++;
                        upBound++;
                    }
                    else {
                        row--;
                    }
                    
                    break;
            }
        }
        
        return traverseElements;
    }
}
