import java.util.*;

class Solution {
    public int tupleSameProduct(int[] nums) {
        int n_tuples = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int prod = nums[i] * nums[j];
                
                // Directly count the number of tuples
                n_tuples += map.getOrDefault(prod, 0) * 8;
                
                // Update frequency in the map
                map.put(prod, map.getOrDefault(prod, 0) + 1);
            }
        }
        return n_tuples;
    }
}
