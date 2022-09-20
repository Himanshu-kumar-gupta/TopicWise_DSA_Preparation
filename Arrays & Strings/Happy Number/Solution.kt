class Solution {
    fun next(n1:Int): Int {
        var sum=0
        var n=n1
        while(n>0) {
            sum+=(n%10)*(n%10)
            n/=10
        }
        
        return sum
    }
    
    fun isHappy(n: Int): Boolean {
        //Tortoise and Hare
        var t=n
        var h=n
        do {
             h = next(next(h))
             t = next(t)
        }while(t!=h)
        
        return t==1
    }
}
