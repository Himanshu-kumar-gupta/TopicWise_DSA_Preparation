class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int pos1=0, pos2 =0, pos1initial=0,pos2initial=0,m=mat.length,n=mat[0].length, dIndex=0;
        int diagonal[] = new int[m*n]; 
        boolean pos1add=false;
        
        for(int i=0;i<m;i++) {
            diagonal[dIndex]=mat[pos1][pos2];
            dIndex++;
            while(pos1!=pos2initial && pos2!=pos1initial) {
                if(pos1add) {
                    pos1++;
                    pos2--;
                }
                else {
                    pos1--;
                    pos2++;
                }
                diagonal[dIndex]=mat[pos1][pos2];
                dIndex++;
            }
            
            if(pos1add)
                pos1++;
            else
                pos2++;
            pos1initial=pos1;
            pos2initial=pos2;
            pos1add=!pos1add;
        }
        
        pos1=1;
        pos2=m-1;
        pos1initial = pos1;
        pos2initial = pos2;
        for(int i=m;i>1;i--){
            diagonal[dIndex]=mat[pos1][pos2];
            dIndex++;
            while(pos1!=pos2initial && pos2!=pos1initial) {
                if(pos1add) {
                    pos1++;
                    pos2--;
                }
                else {
                    pos1--;
                    pos2++;
                }
                diagonal[dIndex]=mat[pos1][pos2];
                dIndex++;
            }
            
            pos1add=!pos1add;
            if(pos1add)
                pos1++;
            else
                pos2++;
            pos1initial=pos1;
            pos2initial=pos2;
        }
        
        return diagonal;
    }
}
