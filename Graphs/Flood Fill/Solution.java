class Solution {
    int rs = 0, cs=0, toFillColor = 0, color1 = 0;
    int imageC[][];
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)
            return image;
        else
            toFillColor = image[sr][sc];
        
        rs = image.length;
        cs = image[0].length;
        color1 = color;
        imageC = image;
        
        sideFill(sr,sc);
        return imageC;
    }

    public void sideFill(int sr,int sc) {
        if(sr>=rs || sr<0 || sc>=cs || sc<0 || imageC[sr][sc]!=toFillColor)
           return;
        else {
            imageC[sr][sc] = color1;
            sideFill(sr-1,sc);
            sideFill(sr,sc-1);
            sideFill(sr+1,sc);
            sideFill(sr,sc+1);
        }
    }
}
