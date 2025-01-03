class Solution {
    public int waysToSplitArray(int[] nums) {
        long prefix_sum=0; 
        for(int num: nums) prefix_sum+=num;
        long left_sum=0;
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            left_sum+=nums[i];
            if(left_sum >=(prefix_sum-left_sum)) c++;
        }
        return c;
    }
}