class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--) {
            if(digits[i]+1==10) {
                if(i==0) {
                    //returning just by adding 1 to array as default element in integer array is 0
                    int addOnePlaceValue[]=new int[digits.length+1];
                    addOnePlaceValue[0]=1;
                    return addOnePlaceValue;
                }
                
                digits[i]=0;
            }
            else {
                digits[i]++;
                return digits;
            }
        }
        return digits;
    }
}
