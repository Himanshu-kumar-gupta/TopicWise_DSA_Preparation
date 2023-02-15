class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new LinkedList<>();

        //Take k as carry
        for(int i = num.length -1;i>=0 || k>0;i--) {
            if(i>-1)
                k+=num[i];
            res.add(0,k%10);
            k/=10;
        }

        return res;
    }
}
