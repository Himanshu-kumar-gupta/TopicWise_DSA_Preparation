class Solution {
    public int next(int n) {
        int sum=0;
        while(n>0) {
            sum+=(n%10)*(n%10);
            n/=10;
        }
        
        return sum;
    }
    
    public boolean isHappy(int n) {
        //Tortoise and Hare
        int t=n;
        int h=n;
        do {
             h = next(next(h));
             t = next(t);
        }while(t!=h);
        
        return t==1;
    }
}
