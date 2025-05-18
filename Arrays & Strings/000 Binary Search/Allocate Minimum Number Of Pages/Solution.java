class Solution {
    public static int findPages(int[] arr, int k) {
        int max = 0, sum = 0, n= arr.length;
        
        if(k>n)
            return -1;
            
        for(int i : arr) {
            if(i>max)
                max = i;
                
            sum+=i;
        }
        
        int start = max, end = sum, res = arr[0];
        while(start<=end) {
            int mid = start + (end - start)/2;
            int count = 1, inSum = 0;
            for(int i=0;i<n;i++) {
                if(inSum + arr[i]<=mid)
                    inSum+=arr[i];
                else {
                    count++;
                    inSum=arr[i];
                }
            }
            
            if(count==k) {
                res = mid;
                end = mid -1;
            }
            else if(count<k)
                end = mid -1;
            else
                start = mid + 1;
        }
        
        return res;
    }
}
