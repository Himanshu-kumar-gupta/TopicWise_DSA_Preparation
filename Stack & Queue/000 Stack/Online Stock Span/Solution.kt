class StockSpanner() {
    var st= Stack<Pair<Int,Int>>()

    fun next(price: Int): Int {
        var span = 1
         while(st.isNotEmpty()&& price >= st.peek().first) 
            // If removing an element add all its span so that it is updated in the top element
            span+=st.pop().second

        st.add(Pair(price,span))
        return  span
    }

}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * var obj = StockSpanner()
 * var param_1 = obj.next(price)
 */
