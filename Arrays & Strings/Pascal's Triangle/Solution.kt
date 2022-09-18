class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val res = ArrayList<List<Int>>()

        val row=ArrayList<Int>()
        row.add(1)
        res.add(ArrayList<Int>(row))
        
        for(i in 1..numRows-1) {
            row.clear()
            //Add 1 at first and last
            row.add(1)
            
            //Compute for middle
            for(j in 1..i-1)
                row.add(res[i-1][j-1] + res[i-1][j])
            row.add(1)
            
            res.add(ArrayList<Int>(row))
        }
        
		return res
    }
}
