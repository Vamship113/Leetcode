class FindSumPairs {
    Map<Integer,Integer> map;
    int[] nums1,nums2;
    public FindSumPairs(int[] nums1, int[] nums2) {
        map= new HashMap<>();
        this.nums1=nums1;
        this.nums2=nums2;
        for(int num: nums2)
            map.put(num,map.getOrDefault(num,0)+1);
    }
    
    public void add(int index, int val) {
       int oldValue=nums2[index];
       map.put(oldValue,map.get(oldValue)-1);

       if(map.get(oldValue)==-1) map.remove(oldValue);
       
       nums2[index]+=val;
       int newValue=nums2[index];
       map.put(newValue,map.getOrDefault(newValue,0)+1);
       
    }
    
    public int count(int tot) {
        int c=0;
        for(int num: nums1){
            int target=tot-num;
            if(map.containsKey(target)){
                c+=map.get(target);
            }
        }
        return c;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */