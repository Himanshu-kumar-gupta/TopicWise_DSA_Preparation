class StockSpanner {

    Stack<int[]> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    //In array index 0 points to price and 1 points to span
    public int next(int price) {
        // Intializing span as 1 as min span should be 1 incase loop doesn't run
        int span = 1;

        // Comparing the price
        while(!st.isEmpty()&& price >= st.peek()[0]) {
            // If removing an element add all its span so that it is updated in the top element
            span+=st.peek()[1];
            st.pop();
        }
        
        st.add(new int[]{price,span});

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
