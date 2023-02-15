class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new LinkedList<>();
        int c = 0;
        
        for(int i = num.length -1;i>=0;i--) {
            int lastDig = k%10;
            k/=10;
            int res1 = num[i]+lastDig+c;

            if(res1>9) {
                c = res1/10;
                res.add(0,res1%10);
            }
            else {
                c=0;
                res.add(0,res1);
            }
        }

        k+=c;
        while(k>0) {
            res.add(0,k%10);
            k/=10;
        }

        return res;
    }
}
