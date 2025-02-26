class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=Integer.MIN_VALUE;
        int sum=0;
        for(int num: nums){
            if(sum<0){
                sum=num;
            }
            else sum+=num;
            max_sum=Math.max(sum,max_sum);
        }
        return max_sum;
    }
}