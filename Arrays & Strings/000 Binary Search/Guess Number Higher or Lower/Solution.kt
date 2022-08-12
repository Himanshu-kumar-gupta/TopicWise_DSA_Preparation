/** 
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
        var start=1
        var end=n
        
        while(start<=end) {
            //To avoid int value overflow
            var mid:Int = start+(end-start)/2
            
            when(guess(mid)) {
                //If pick found then return it
                0 -> return mid
                //If pick is lower reduce search space to left half 
                -1 -> end=mid-1
                //If pick is higher reduce search space to right half 
                else -> start=mid+1
            }
        }
        
        return -1
    }
}
