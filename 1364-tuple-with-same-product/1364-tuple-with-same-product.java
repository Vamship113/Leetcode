class Solution {
    public int tupleSameProduct(int[] nums) {
        int n=nums.length;
        int n_tuples=0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int prod = nums[i] * nums[j];
                map.put(prod, map.getOrDefault(prod, 0) + 1);
            }
        }

        for(Integer key:map.keySet()){
            Integer value=map.get(key);
            if(value>1) 
            n_tuples+=((value*(value-1)/2)*8);
        }
        return n_tuples;
    }
}