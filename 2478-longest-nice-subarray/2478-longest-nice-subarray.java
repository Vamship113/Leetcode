class Solution {
    public int longestNiceSubarray(int[] nums) {
        int usedBits=0;
        int max_window=0;
        int window_start=0;
        for(int window_end=0; window_end<nums.length ;window_end++){
            while((nums[window_end] & usedBits) !=0 ){
                usedBits^=nums[window_start];
                window_start++;
            }
            usedBits |= nums[window_end];
            max_window = Math.max(max_window,window_end-window_start+1);
        }
        return max_window;
    }
}