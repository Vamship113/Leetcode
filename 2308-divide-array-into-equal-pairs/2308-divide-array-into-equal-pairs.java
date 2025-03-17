class Solution {
    public boolean divideArray(int[] nums) {
        int[] freqs = new int[501];
        for(int num : nums)
        freqs[num]++;

        for(int freq : freqs ){
            if(freq%2!=0) return false;
        }
        return true;
    }
}