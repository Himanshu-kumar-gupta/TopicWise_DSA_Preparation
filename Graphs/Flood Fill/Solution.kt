class Solution {
    var rs = 0 
    var cs = 0
    var toFillColor = 0
    lateinit var image2: Array<IntArray>
    var color1 = 0 
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        
        if(image[sr][sc]==color)
            return image
        else
            toFillColor = image[sr][sc]
        
        rs = image.size
        cs = image[0].size
        color1 = color
        image2 = image
        
        sideFill(sr,sc)
        return image2
    }
    
    fun sideFill(sr: Int, sc: Int) {
        if(sr>=rs || sr<0 || sc>=cs || sc<0 || image2[sr][sc]!=toFillColor)
           return 
        else {
            image2[sr][sc] = color1
            sideFill(sr-1,sc)
            sideFill(sr,sc-1)
            sideFill(sr+1,sc)
            sideFill(sr,sc+1)
        }
          
    }
}
