class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans= new int[k];
        int l=nums.length;

        List<int[]> list= new ArrayList<>();
        for(int i=0;i<l;i++)
        list.add( new int[]{nums[i],i});
        // sort descreasing order based on num,and index

        list.sort((a,b)->b[0]-a[0]);
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<k;i++)
        set.add(list.get(i)[1]);
        

        int ind=0;
        for(int i=0;i<l;i++){
            if(set.contains(i)) ans[ind++]=nums[i];
        }
        return ans;

    }
}

/*

 2  (2,0)
 1  (1,1)
 3  (3,2)
 3  (3,3)


*/