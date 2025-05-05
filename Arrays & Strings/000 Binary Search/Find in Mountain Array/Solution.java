class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0, end = mountainArr.length()-1;
        int peakIndex = -1;

        // Finding the Peak ele
        // Using < instead of <= so that when extreme elements we do not move out of bound
        // also it works because it is clear that ele is present and will be at start==end
        while(start < end){
            int mid = start + (end-start)/2;

            if(mountainArr.get(mid+1)>mountainArr.get(mid))
                start = mid+1;
            else
                end=mid-1;
        }

        //this can be start or end
        peakIndex = start;

        // Finding the element in first half
        end = peakIndex; // this line is not necessary but for understanding
        start = 0;  
              
        while(start <= end){
            int mid = start + (end-start)/2;
            int eleMid = mountainArr.get(mid);
            if(eleMid==target)
                return mid;
            else if(target>eleMid)
                start = mid+1;
            else
                end=mid-1;
        }

        //If no returns from first half then search ele in second half
        start= peakIndex+1;
        end = mountainArr.length()-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            int eleMid = mountainArr.get(mid);

            if(eleMid==target)
                return mid;
            else if(target<eleMid)
                start = mid+1;
            else
                end=mid-1;
        }

        //If no return till now then ele is not present
        return -1;
    }
}
