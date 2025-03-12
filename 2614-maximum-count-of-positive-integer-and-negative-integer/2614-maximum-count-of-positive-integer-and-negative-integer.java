class Solution {
    public int maximumCount(int[] nums) {
        int neg=0,zero=0;
        for(int num: nums){
            if(num<0) neg++;
            else if(num==0) zero++;
            else {
                return Math.max(neg,nums.length-neg-zero);
            }
        }
        return Math.max(neg,nums.length-neg-zero);
    }
}