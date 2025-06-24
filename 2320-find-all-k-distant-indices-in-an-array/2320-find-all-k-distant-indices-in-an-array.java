class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> l = new ArrayList<>();
        int len=nums.length;
        boolean[] visited = new boolean[len];
        for(int i=0;i<len;i++){
            if(nums[i]==key)
            {
                for(int j=Math.max(0,i-k);j<=Math.min(len-1,i+k);j++){
                    if (!visited[j]) {
                        l.add(j);
                        visited[j] = true;
                    }
                }
            }
        }
        return l;
    }

}