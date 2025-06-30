class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = 0, n = nums.length, len = 0;

        while (j < n) {
            if (nums[j] - nums[i] > 1) {
                i++; // shrink window
            } else if (nums[j] - nums[i] == 1) {
                len = Math.max(len, j - i + 1); // valid window
                j++;
            } else {
                j++; // difference < 1, move j forward
            }
        }
        return len;
    }
}
