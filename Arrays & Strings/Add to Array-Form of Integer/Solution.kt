class Solution {
    fun addToArrayForm(num: IntArray,k: Int): List<Int> {

        val res = LinkedList<Int>()
        var k1 = k
        //Take k as carry
        var i = num.size - 1
        while(i>=0 || k1>0) {
            if(i>-1)
                k1+=num[i--]
            res.add(0,k1%10)
            k1/=10
        }

        return res
    }
}
